$backend_dir = "backend-core/src/main/java/com/vertexml"
$frontend_dir = "frontend/src"
$ml_dir = "ml-services/app"

function Write-File {
    param([string]$Path, [string]$Content)
    $dir = Split-Path $Path
    if (-not (Test-Path $dir)) {
        New-Item -ItemType Directory -Force -Path $dir | Out-Null
    }
    Set-Content -Path $Path -Value $Content
}

# PHASE 2: CORE PLATFORM & SECURITY
Write-Host "Scaffolding Phase 2..."
Write-File "$backend_dir/domain/Role.java" "package com.vertexml.domain;`npublic enum Role { ADMIN, DATA_SCIENTIST, ML_ENGINEER, VIEWER }"
Write-File "$backend_dir/domain/User.java" "package com.vertexml.domain;`nimport jakarta.persistence.*;`nimport lombok.Data;`nimport java.util.UUID;`n@Entity @Table(name=`"users`") @Data`npublic class User {`n    @Id @GeneratedValue(strategy=GenerationType.UUID) private UUID id;`n    @Column(unique=true, nullable=false) private String email;`n    @Column(nullable=false) private String password;`n    @Enumerated(EnumType.STRING) private Role role;`n}"
Write-File "$backend_dir/domain/UserRepository.java" "package com.vertexml.domain;`nimport org.springframework.data.jpa.repository.JpaRepository;`nimport java.util.Optional;`nimport java.util.UUID;`npublic interface UserRepository extends JpaRepository<User, UUID> {`n    Optional<User> findByEmail(String email);`n}"
Write-File "$backend_dir/security/JwtTokenProvider.java" "package com.vertexml.security;`nimport org.springframework.stereotype.Component;`n@Component`npublic class JwtTokenProvider {`n    public String generateToken(String email) { return `"dummy-jwt-token`"; }`n    public boolean validateToken(String token) { return true; }`n}"
Write-File "$backend_dir/security/SecurityConfig.java" "package com.vertexml.security;`nimport org.springframework.context.annotation.Configuration;`n@Configuration`npublic class SecurityConfig {}"
Write-File "$backend_dir/presentation/AuthController.java" "package com.vertexml.presentation;`nimport org.springframework.web.bind.annotation.*;`n@RestController @RequestMapping(`"/api/auth`")`npublic class AuthController {`n    @PostMapping(`"/login`") public String login() { return `"token`"; }`n}"

Write-File "backend-core/src/main/resources/db/migration/V1__init_schema.sql" "CREATE TABLE users (id UUID PRIMARY KEY, email VARCHAR(255) UNIQUE NOT NULL, password VARCHAR(255) NOT NULL, role VARCHAR(50) NOT NULL);"

Write-File "$frontend_dir/features/auth/authSlice.ts" "import { createSlice } from '@reduxjs/toolkit';`nexport const authSlice = createSlice({ name: 'auth', initialState: { user: null, token: null }, reducers: {} });`nexport default authSlice.reducer;"
Write-File "$frontend_dir/features/auth/Login.tsx" "import React from 'react';`nexport const Login = () => { return <div>Login Page</div>; };"
Write-File "$ml_dir/api/auth.py" "from fastapi import APIRouter, Depends`nrouter = APIRouter()`n@router.get('/me')`ndef get_me(): return {'user': 'dummy'}"

# PHASE 3: PROJECT & DATA MANAGEMENT
Write-Host "Scaffolding Phase 3..."
Write-File "$backend_dir/domain/Workspace.java" "package com.vertexml.domain;`nimport jakarta.persistence.*;`nimport lombok.Data;`nimport java.util.UUID;`n@Entity @Data public class Workspace { @Id private UUID id; private String name; }"
Write-File "$backend_dir/domain/Project.java" "package com.vertexml.domain;`nimport jakarta.persistence.*;`nimport lombok.Data;`nimport java.util.UUID;`n@Entity @Data public class Project { @Id private UUID id; private String name; @ManyToOne private Workspace workspace; }"
Write-File "$backend_dir/domain/Dataset.java" "package com.vertexml.domain;`nimport jakarta.persistence.*;`nimport lombok.Data;`nimport java.util.UUID;`n@Entity @Data public class Dataset { @Id private UUID id; private String name; private String s3Path; }"
Write-File "$backend_dir/presentation/ProjectController.java" "package com.vertexml.presentation;`nimport org.springframework.web.bind.annotation.*;`n@RestController @RequestMapping(`"/api/projects`")`npublic class ProjectController {}"
Write-File "$backend_dir/presentation/DatasetController.java" "package com.vertexml.presentation;`nimport org.springframework.web.bind.annotation.*;`n@RestController @RequestMapping(`"/api/datasets`")`npublic class DatasetController {}"

Write-File "$frontend_dir/features/projects/ProjectDashboard.tsx" "import React from 'react';`nexport const ProjectDashboard = () => <div>Projects</div>;"
Write-File "$frontend_dir/features/datasets/DatasetExplorer.tsx" "import React from 'react';`nexport const DatasetExplorer = () => <div>Datasets</div>;"

# PHASE 4: ML PIPELINES & EXPERIMENT TRACKING
Write-Host "Scaffolding Phase 4..."
Write-File "$backend_dir/domain/Experiment.java" "package com.vertexml.domain;`nimport jakarta.persistence.*;`nimport lombok.Data;`nimport java.util.UUID;`n@Entity @Data public class Experiment { @Id private UUID id; private String name; @ManyToOne private Project project; }"
Write-File "$backend_dir/domain/Run.java" "package com.vertexml.domain;`nimport jakarta.persistence.*;`nimport lombok.Data;`nimport java.util.UUID;`n@Entity @Data @Table(name=`"runs`") public class Run { @Id private UUID id; private String status; @ManyToOne private Experiment experiment; }"

Write-File "$ml_dir/pipelines/training.py" "def train_model(dataset_path: str):`n    print('Training model on', dataset_path)`n    return 'model.pkl'"
Write-File "$ml_dir/api/jobs.py" "from fastapi import APIRouter`nrouter = APIRouter()`n@router.post('/train')`ndef start_training(): return {'status': 'started'}"

Write-File "$frontend_dir/features/experiments/ExperimentList.tsx" "import React from 'react';`nexport const ExperimentList = () => <div>Experiments</div>;"

# PHASE 5: MODEL REGISTRY & INFERENCE APIs
Write-Host "Scaffolding Phase 5..."
Write-File "$backend_dir/domain/Model.java" "package com.vertexml.domain;`nimport jakarta.persistence.*;`nimport lombok.Data;`nimport java.util.UUID;`n@Entity @Data @Table(name=`"models`") public class Model { @Id private UUID id; private String name; }"
Write-File "$backend_dir/domain/ModelVersion.java" "package com.vertexml.domain;`nimport jakarta.persistence.*;`nimport lombok.Data;`nimport java.util.UUID;`n@Entity @Data public class ModelVersion { @Id private UUID id; private String version; @ManyToOne private Model model; }"

Write-File "$ml_dir/models/inference.py" "def predict(model_path, data):`n    return [0.95, 0.05]"
Write-File "$ml_dir/api/inference.py" "from fastapi import APIRouter`nrouter = APIRouter()`n@router.post('/predict')`ndef predict(): return {'prediction': []}"

Write-File "$frontend_dir/features/models/ModelRegistry.tsx" "import React from 'react';`nexport const ModelRegistry = () => <div>Model Registry</div>;"

# PHASE 6: ENTERPRISE FEATURES
Write-Host "Scaffolding Phase 6..."
Write-File "$backend_dir/domain/AuditLog.java" "package com.vertexml.domain;`nimport jakarta.persistence.*;`nimport lombok.Data;`nimport java.util.UUID;`n@Entity @Data public class AuditLog { @Id private UUID id; private String action; private String userEmail; }"
Write-File "$backend_dir/presentation/AdminController.java" "package com.vertexml.presentation;`nimport org.springframework.web.bind.annotation.*;`n@RestController @RequestMapping(`"/api/admin`")`npublic class AdminController {}"

Write-File "$frontend_dir/features/admin/AdminDashboard.tsx" "import React from 'react';`nexport const AdminDashboard = () => <div>Admin Dashboard</div>;"

Write-Host "Done scaffolding."
