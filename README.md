# Enterprise VertexML Engine Platform

## Overview
VertexML is a production-ready Machine Learning platform providing end-to-end capabilities from dataset management to model training and inference. Built using Clean Architecture and microservices.

## Tech Stack
- **Frontend**: React, TypeScript, Vite, Redux Toolkit
- **Backend**: Spring Boot 3, Java 21, Spring Security, Hibernate
- **ML Services**: FastAPI, Python 3.12, scikit-learn
- **Infrastructure**: PostgreSQL, Redis, Docker, Kubernetes

## Getting Started
1. Start local dependencies: `docker-compose up -d`
2. Start Backend: `cd backend-core && ./mvnw spring-boot:run`
3. Start ML Service: `cd ml-services && uvicorn app.main:app --reload`
4. Start Frontend: `cd frontend && npm run dev`

## Architecture
- **Core Platform**: Handles RBAC, JWT Auth, and metadata.
- **Compute Node**: Handles heavy ML training workloads asynchronously.

## Deployment
Kubernetes manifests are located in the /k8s directory. Apply them using: `kubectl apply -f k8s/`

