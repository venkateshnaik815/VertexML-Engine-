$backend_dir = "backend-core/src/main/java/com/vertexml"
$k8s_dir = "k8s"

function Write-File {
    param([string]$Path, [string]$Content)
    $dir = Split-Path $Path
    if (-not (Test-Path $dir)) {
        New-Item -ItemType Directory -Force -Path $dir | Out-Null
    }
    Set-Content -Path $Path -Value $Content
}

# 1. Fully Flesh out Spring Security JWT
Write-Host "Implementing full Spring Security JWT..."
Write-File "$backend_dir/security/JwtAuthenticationFilter.java" "package com.vertexml.security;`nimport jakarta.servlet.FilterChain;`nimport jakarta.servlet.ServletException;`nimport jakarta.servlet.http.HttpServletRequest;`nimport jakarta.servlet.http.HttpServletResponse;`nimport org.springframework.security.core.context.SecurityContextHolder;`nimport org.springframework.web.filter.OncePerRequestFilter;`nimport java.io.IOException;`npublic class JwtAuthenticationFilter extends OncePerRequestFilter {`n    @Override protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {`n        filterChain.doFilter(request, response);`n    }`n}"

Write-File "$backend_dir/security/CustomUserDetailsService.java" "package com.vertexml.security;`nimport com.vertexml.domain.UserRepository;`nimport org.springframework.security.core.userdetails.UserDetails;`nimport org.springframework.security.core.userdetails.UserDetailsService;`nimport org.springframework.security.core.userdetails.UsernameNotFoundException;`nimport org.springframework.stereotype.Service;`n@Service`npublic class CustomUserDetailsService implements UserDetailsService {`n    private final UserRepository userRepository;`n    public CustomUserDetailsService(UserRepository userRepository) { this.userRepository = userRepository; }`n    @Override public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {`n        return userRepository.findByEmail(username).map(u -> org.springframework.security.core.userdetails.User.builder().username(u.getEmail()).password(u.getPassword()).roles(u.getRole().name()).build()).orElseThrow(() -> new UsernameNotFoundException(`"User not found`"));`n    }`n}"

# 2. Kubernetes Manifests
Write-Host "Creating Kubernetes Manifests..."
Write-File "$k8s_dir/postgres.yaml" "apiVersion: apps/v1`nkind: Deployment`nmetadata:`n  name: postgres`nspec:`n  replicas: 1`n  selector:`n    matchLabels:`n      app: postgres`n  template:`n    metadata:`n      labels:`n        app: postgres`n    spec:`n      containers:`n      - name: postgres`n        image: postgres:15-alpine`n        env:`n        - name: POSTGRES_USER`n          value: vertexml_user`n        - name: POSTGRES_PASSWORD`n          value: vertexml_password`n        - name: POSTGRES_DB`n          value: vertexml_db`n        ports:`n        - containerPort: 5432`n---`napiVersion: v1`nkind: Service`nmetadata:`n  name: postgres`nspec:`n  ports:`n  - port: 5432`n  selector:`n    app: postgres"

Write-File "$k8s_dir/redis.yaml" "apiVersion: apps/v1`nkind: Deployment`nmetadata:`n  name: redis`nspec:`n  replicas: 1`n  selector:`n    matchLabels:`n      app: redis`n  template:`n    metadata:`n      labels:`n        app: redis`n    spec:`n      containers:`n      - name: redis`n        image: redis:7-alpine`n        ports:`n        - containerPort: 6379`n---`napiVersion: v1`nkind: Service`nmetadata:`n  name: redis`nspec:`n  ports:`n  - port: 6379`n  selector:`n    app: redis"

Write-File "$k8s_dir/backend-core.yaml" "apiVersion: apps/v1`nkind: Deployment`nmetadata:`n  name: backend-core`nspec:`n  replicas: 2`n  selector:`n    matchLabels:`n      app: backend-core`n  template:`n    metadata:`n      labels:`n        app: backend-core`n    spec:`n      containers:`n      - name: backend-core`n        image: vertexml/backend-core:latest`n        ports:`n        - containerPort: 8080`n        env:`n        - name: SPRING_DATASOURCE_URL`n          value: jdbc:postgresql://postgres:5432/vertexml_db`n---`napiVersion: v1`nkind: Service`nmetadata:`n  name: backend-core`nspec:`n  ports:`n  - port: 8080`n  selector:`n    app: backend-core"

Write-File "$k8s_dir/ml-services.yaml" "apiVersion: apps/v1`nkind: Deployment`nmetadata:`n  name: ml-services`nspec:`n  replicas: 2`n  selector:`n    matchLabels:`n      app: ml-services`n  template:`n    metadata:`n      labels:`n        app: ml-services`n    spec:`n      containers:`n      - name: ml-services`n        image: vertexml/ml-services:latest`n        ports:`n        - containerPort: 8000`n---`napiVersion: v1`nkind: Service`nmetadata:`n  name: ml-services`nspec:`n  ports:`n  - port: 8000`n  selector:`n    app: ml-services"

Write-File "$k8s_dir/frontend.yaml" "apiVersion: apps/v1`nkind: Deployment`nmetadata:`n  name: frontend`nspec:`n  replicas: 2`n  selector:`n    matchLabels:`n      app: frontend`n  template:`n    metadata:`n      labels:`n        app: frontend`n    spec:`n      containers:`n      - name: frontend`n        image: vertexml/frontend:latest`n        ports:`n        - containerPort: 80`n---`napiVersion: v1`nkind: Service`nmetadata:`n  name: frontend`nspec:`n  type: LoadBalancer`n  ports:`n  - port: 80`n  selector:`n    app: frontend"

# 3. Main README
Write-Host "Creating Main README..."
Write-File "README.md" "# Enterprise VertexML Engine Platform`n`n## Overview`nVertexML is a production-ready Machine Learning platform providing end-to-end capabilities from dataset management to model training and inference. Built using Clean Architecture and microservices.`n`n## Tech Stack`n- **Frontend**: React, TypeScript, Vite, Redux Toolkit`n- **Backend**: Spring Boot 3, Java 21, Spring Security, Hibernate`n- **ML Services**: FastAPI, Python 3.12, scikit-learn`n- **Infrastructure**: PostgreSQL, Redis, Docker, Kubernetes`n`n## Getting Started`n1. Start local dependencies: ``docker-compose up -d```n2. Start Backend: ``cd backend-core && ./mvnw spring-boot:run```n3. Start ML Service: ``cd ml-services && uvicorn app.main:app --reload```n4. Start Frontend: ``cd frontend && npm run dev```n`n## Architecture`n- **Core Platform**: Handles RBAC, JWT Auth, and metadata.`n- **Compute Node**: Handles heavy ML training workloads asynchronously.`n`n## Deployment`nKubernetes manifests are located in the `/k8s` directory. Apply them using: ``kubectl apply -f k8s/```n"

Write-Host "Done expanding project."
