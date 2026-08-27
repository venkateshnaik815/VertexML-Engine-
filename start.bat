@echo off
echo Starting VertexML Engine...
cd backend-core
start mvnw spring-boot:run
cd ../frontend
start npm run dev
