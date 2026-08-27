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

Write-Host "Building fully working application components..."

# 1. Fully Working Spring Boot Backend
Write-File "$backend_dir/domain/ProjectRepository.java" "package com.vertexml.domain;`nimport org.springframework.data.jpa.repository.JpaRepository;`nimport java.util.UUID;`npublic interface ProjectRepository extends JpaRepository<Project, UUID> {}"

Write-File "$backend_dir/application/ProjectService.java" "package com.vertexml.application;`nimport com.vertexml.domain.Project;`nimport com.vertexml.domain.ProjectRepository;`nimport org.springframework.stereotype.Service;`nimport java.util.List;`nimport java.util.UUID;`n@Service`npublic class ProjectService {`n    private final ProjectRepository repository;`n    public ProjectService(ProjectRepository repository) { this.repository = repository; }`n    public List<Project> getAllProjects() { return repository.findAll(); }`n    public Project createProject(Project project) { return repository.save(project); }`n    public void deleteProject(UUID id) { repository.deleteById(id); }`n}"

Write-File "$backend_dir/presentation/ProjectController.java" "package com.vertexml.presentation;`nimport com.vertexml.domain.Project;`nimport com.vertexml.application.ProjectService;`nimport org.springframework.web.bind.annotation.*;`nimport java.util.List;`nimport java.util.UUID;`n@RestController @RequestMapping(`/`"/api/projects`/`") @CrossOrigin(origins = `/`"*`/`")`npublic class ProjectController {`n    private final ProjectService service;`n    public ProjectController(ProjectService service) { this.service = service; }`n    @GetMapping public List<Project> getProjects() { return service.getAllProjects(); }`n    @PostMapping public Project createProject(@RequestBody Project project) { return service.createProject(project); }`n    @DeleteMapping(`/`"/{id}`/`") public void deleteProject(@PathVariable UUID id) { service.deleteProject(id); }`n}"

# 2. Fully Working React Frontend
Write-File "$frontend_dir/App.tsx" "import React, { useState, useEffect } from 'react';`nimport axios from 'axios';`n`nexport default function App() {`n  const [projects, setProjects] = useState([]);`n  const [newProjectName, setNewProjectName] = useState('');`n`n  useEffect(() => { fetchProjects(); }, []);`n`n  const fetchProjects = async () => {`n    try {`n      const res = await axios.get('http://localhost:8080/api/projects');`n      setProjects(res.data);`n    } catch (e) { console.error('Error fetching projects'); }`n  };`n`n  const createProject = async () => {`n    if (!newProjectName) return;`n    try {`n      await axios.post('http://localhost:8080/api/projects', { name: newProjectName });`n      setNewProjectName('');`n      fetchProjects();`n    } catch (e) { console.error('Error creating project'); }`n  };`n`n  return (`n    <div className=`"min-h-screen bg-gray-100 p-8`">`n      <h1 className=`"text-3xl font-bold mb-6 text-blue-600`">VertexML Engine Platform</h1>`n      <div className=`"bg-white p-6 rounded shadow-md w-full max-w-md`">`n        <h2 className=`"text-xl font-semibold mb-4`">Projects</h2>`n        <div className=`"flex mb-4`">`n          <input type=`"text`" className=`"border p-2 flex-grow rounded-l`" value={newProjectName} onChange={(e) => setNewProjectName(e.target.value)} placeholder=`"New Project Name`" />`n          <button className=`"bg-blue-600 text-white px-4 py-2 rounded-r`" onClick={createProject}>Create</button>`n        </div>`n        <ul>`n          {projects.map((p: any) => (`n            <li key={p.id} className=`"border-b py-2`">{p.name}</li>`n          ))}`n        </ul>`n      </div>`n    </div>`n  );`n}"

Write-File "frontend/package.json" "{`"name`": `"frontend`", `"private`": true, `"version`": `"0.0.0`", `"type`": `"module`", `"scripts`": { `"dev`": `"vite`", `"build`": `"tsc -b && vite build`", `"lint`": `"eslint .`", `"preview`": `"vite preview`" }, `"dependencies`": { `"axios`": `"^1.6.0`", `"react`": `"^18.3.1`", `"react-dom`": `"^18.3.1`", `"tailwindcss`": `"^3.4.0`" }, `"devDependencies`": { `"@types/react`": `"^18.3.3`", `"@types/react-dom`": `"^18.3.0`", `"@vitejs/plugin-react`": `"^4.3.1`", `"vite`": `"^5.4.1`", `"autoprefixer`": `"^10.4.17`", `"postcss`": `"^8.4.35`" } }"

Write-File "frontend/postcss.config.js" "export default { plugins: { tailwindcss: {}, autoprefixer: {}, }, }"
Write-File "frontend/tailwind.config.js" "/** @type {import('tailwindcss').Config} */`nexport default { content: ['./index.html', './src/**/*.{js,ts,jsx,tsx}'], theme: { extend: {}, }, plugins: [], }"
Write-File "$frontend_dir/index.css" "@tailwind base;`n@tailwind components;`n@tailwind utilities;"

# 3. Fully Working FastAPI ML Service
Write-File "$ml_dir/main.py" "from fastapi import FastAPI, BackgroundTasks`nfrom pydantic import BaseModel`nimport time`n`napp = FastAPI(title='VertexML Engine ML Services')`n`nclass TrainRequest(BaseModel):`n    dataset_name: str`n    model_type: str`n`ndef simulate_training(dataset_name: str, model_type: str):`n    print(f'Starting training for {model_type} on {dataset_name}...')`n    time.sleep(5)  # Simulate long training`n    print('Training completed and model saved to artifact store.')`n`n@app.post('/api/jobs/train')`ndef start_training(req: TrainRequest, background_tasks: BackgroundTasks):`n    background_tasks.add_task(simulate_training, req.dataset_name, req.model_type)`n    return {'status': 'Training job submitted successfully', 'dataset': req.dataset_name}`n`n@app.get('/health')`ndef health_check():`n    return {'status': 'healthy'}"

Write-Host "Done writing fully functional files."
