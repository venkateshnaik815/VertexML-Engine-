#!/bin/bash
echo 'Starting VertexML Engine...'
cd backend-core && ./mvnw spring-boot:run &
cd frontend && npm run dev &
wait
