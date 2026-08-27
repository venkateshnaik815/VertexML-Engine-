import os
import zipfile

# 1. Generate Java Code
java_base = "backend-core/src/main/java/com/vertexml/generated"
os.makedirs(f"{java_base}/domain", exist_ok=True)
os.makedirs(f"{java_base}/repo", exist_ok=True)
os.makedirs(f"{java_base}/service", exist_ok=True)
os.makedirs(f"{java_base}/controller", exist_ok=True)

for i in range(1, 301):
    entity_name = f"GenEntity{i}"
    
    # Entity
    entity_code = f"""package com.vertexml.generated.domain;
import jakarta.persistence.*;
import java.util.UUID;
import java.time.LocalDateTime;

@Entity
@Table(name="gen_entity_{i}")
public class {entity_name} {{
    @Id @GeneratedValue(strategy=GenerationType.UUID)
    private UUID id;
    private String name;
    private String description;
    private String status;
    private String type;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private int counter1;
    private int counter2;
    private double metric1;
    private double metric2;
    private boolean isActive;
    private boolean isDeleted;
    private String metadata;
    private String tags;

    public {entity_name}() {{}}

    public UUID getId() {{ return id; }}
    public void setId(UUID id) {{ this.id = id; }}
    public String getName() {{ return name; }}
    public void setName(String name) {{ this.name = name; }}
    public String getDescription() {{ return description; }}
    public void setDescription(String description) {{ this.description = description; }}
    public String getStatus() {{ return status; }}
    public void setStatus(String status) {{ this.status = status; }}
    public String getType() {{ return type; }}
    public void setType(String type) {{ this.type = type; }}
    public LocalDateTime getCreatedAt() {{ return createdAt; }}
    public void setCreatedAt(LocalDateTime createdAt) {{ this.createdAt = createdAt; }}
    public LocalDateTime getUpdatedAt() {{ return updatedAt; }}
    public void setUpdatedAt(LocalDateTime updatedAt) {{ this.updatedAt = updatedAt; }}
    public int getCounter1() {{ return counter1; }}
    public void setCounter1(int counter1) {{ this.counter1 = counter1; }}
    public int getCounter2() {{ return counter2; }}
    public void setCounter2(int counter2) {{ this.counter2 = counter2; }}
    public double getMetric1() {{ return metric1; }}
    public void setMetric1(double metric1) {{ this.metric1 = metric1; }}
    public double getMetric2() {{ return metric2; }}
    public void setMetric2(double metric2) {{ this.metric2 = metric2; }}
    public boolean isActive() {{ return isActive; }}
    public void setActive(boolean active) {{ isActive = active; }}
    public boolean isDeleted() {{ return isDeleted; }}
    public void setDeleted(boolean deleted) {{ isDeleted = deleted; }}
    public String getMetadata() {{ return metadata; }}
    public void setMetadata(String metadata) {{ this.metadata = metadata; }}
    public String getTags() {{ return tags; }}
    public void setTags(String tags) {{ this.tags = tags; }}

    public void processMetrics() {{
        this.metric1 = this.counter1 * 1.5;
        this.metric2 = this.counter2 * 2.5;
    }}
    
    public void reset() {{
        this.counter1 = 0;
        this.counter2 = 0;
        this.metric1 = 0.0;
        this.metric2 = 0.0;
    }}
}}
"""
    with open(f"{java_base}/domain/{entity_name}.java", "w") as f:
        f.write(entity_code)

    # Repo
    repo_code = f"""package com.vertexml.generated.repo;
import com.vertexml.generated.domain.{entity_name};
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface {entity_name}Repository extends JpaRepository<{entity_name}, UUID> {{
    List<{entity_name}> findByName(String name);
    List<{entity_name}> findByStatus(String status);
    List<{entity_name}> findByType(String type);
    List<{entity_name}> findByIsActiveTrue();
}}
"""
    with open(f"{java_base}/repo/{entity_name}Repository.java", "w") as f:
        f.write(repo_code)

    # Service
    service_code = f"""package com.vertexml.generated.service;
import com.vertexml.generated.domain.{entity_name};
import com.vertexml.generated.repo.{entity_name}Repository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class {entity_name}Service {{
    private final {entity_name}Repository repo;
    public {entity_name}Service({entity_name}Repository repo) {{ this.repo = repo; }}
    
    public List<{entity_name}> getAll() {{ return repo.findAll(); }}
    public {entity_name} getById(UUID id) {{ return repo.findById(id).orElse(null); }}
    public {entity_name} create({entity_name} entity) {{
        entity.processMetrics();
        return repo.save(entity);
    }}
    public {entity_name} update(UUID id, {entity_name} entity) {{
        if(repo.existsById(id)) {{
            entity.setId(id);
            entity.processMetrics();
            return repo.save(entity);
        }}
        return null;
    }}
    public void delete(UUID id) {{ repo.deleteById(id); }}
    public void bulkProcess() {{
        List<{entity_name}> all = repo.findAll();
        for({entity_name} e : all) {{
            e.setCounter1(e.getCounter1() + 1);
            e.processMetrics();
        }}
        repo.saveAll(all);
    }}
}}
"""
    with open(f"{java_base}/service/{entity_name}Service.java", "w") as f:
        f.write(service_code)

    # Controller
    controller_code = f"""package com.vertexml.generated.controller;
import com.vertexml.generated.domain.{entity_name};
import com.vertexml.generated.service.{entity_name}Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen{i}")
public class {entity_name}Controller {{
    private final {entity_name}Service service;
    public {entity_name}Controller({entity_name}Service service) {{ this.service = service; }}
    
    @GetMapping
    public List<{entity_name}> getAll() {{ return service.getAll(); }}
    
    @GetMapping("/{{id}}")
    public {entity_name} getById(@PathVariable UUID id) {{ return service.getById(id); }}
    
    @PostMapping
    public {entity_name} create(@RequestBody {entity_name} entity) {{ return service.create(entity); }}
    
    @PutMapping("/{{id}}")
    public {entity_name} update(@PathVariable UUID id, @RequestBody {entity_name} entity) {{ return service.update(id, entity); }}
    
    @DeleteMapping("/{{id}}")
    public void delete(@PathVariable UUID id) {{ service.delete(id); }}
    
    @PostMapping("/bulk-process")
    public void bulkProcess() {{ service.bulkProcess(); }}
}}
"""
    with open(f"{java_base}/controller/{entity_name}Controller.java", "w") as f:
        f.write(controller_code)

# 2. Generate React Code
react_base = "frontend/src/generated"
os.makedirs(react_base, exist_ok=True)

for i in range(1, 201):
    comp_name = f"GenComponent{i}"
    react_code = f"""import React, {{ useState, useEffect }} from 'react';

export default function {comp_name}() {{
    const [data, setData] = useState<any[]>([]);
    const [loading, setLoading] = useState(true);
    const [filter, setFilter] = useState('');
    const [count, setCount] = useState(0);
    const [theme, setTheme] = useState('light');
    const [isVisible, setIsVisible] = useState(true);

    useEffect(() => {{
        const timer = setTimeout(() => setLoading(false), 1000);
        return () => clearTimeout(timer);
    }}, []);

    const processData = () => {{
        return data.filter(d => d.name.includes(filter)).map(d => ({{
            ...d,
            processedValue: d.value * 2.5 + count,
            status: d.value > 100 ? 'HIGH' : 'LOW'
        }}));
    }};

    const toggleTheme = () => setTheme(t => t === 'light' ? 'dark' : 'light');
    const increment = () => setCount(c => c + 1);
    const decrement = () => setCount(c => Math.max(0, c - 1));

    if (loading) return <div>Loading component {i}...</div>;
    if (!isVisible) return <button onClick={{() => setIsVisible(true)}}>Show {i}</button>;

    return (
        <div className={{`p-4 rounded-lg shadow ${{theme === 'dark' ? 'bg-slate-800 text-white' : 'bg-white text-slate-800'}}`}}>
            <h2 className="text-xl font-bold mb-4">Generated Analytics Component {i}</h2>
            <div className="flex space-x-2 mb-4">
                <button onClick={{increment}} className="px-3 py-1 bg-blue-500 text-white rounded">Inc</button>
                <button onClick={{decrement}} className="px-3 py-1 bg-red-500 text-white rounded">Dec</button>
                <button onClick={{toggleTheme}} className="px-3 py-1 bg-gray-500 text-white rounded">Theme</button>
                <button onClick={{() => setIsVisible(false)}} className="px-3 py-1 bg-slate-500 text-white rounded">Hide</button>
            </div>
            <div className="mb-4">
                <p>Current Count: {{count}}</p>
                <p>Current Theme: {{theme}}</p>
            </div>
            <input 
                type="text" 
                value={{filter}} 
                onChange={{e => setFilter(e.target.value)}} 
                placeholder="Filter data..."
                className="w-full p-2 border rounded mb-4 text-black"
            />
            <div className="grid grid-cols-2 gap-4">
                {{processData().map((d, idx) => (
                    <div key={{idx}} className="p-3 border rounded">
                        <p className="font-bold">{{d.name}}</p>
                        <p>Value: {{d.processedValue}}</p>
                        <p>Status: {{d.status}}</p>
                    </div>
                ))}}
            </div>
            <div className="mt-8 p-4 bg-slate-100 rounded text-slate-700">
                <h3 className="font-bold mb-2">Detailed Metrics</h3>
                <ul>
                    <li>Metric A: {{count * 1.5}}</li>
                    <li>Metric B: {{count * 2.5}}</li>
                    <li>Metric C: {{count * 3.5}}</li>
                    <li>Metric D: {{count * 4.5}}</li>
                    <li>Metric E: {{count * 5.5}}</li>
                </ul>
            </div>
        </div>
    );
}}
"""
    with open(f"{react_base}/{comp_name}.tsx", "w") as f:
        f.write(react_code)

# 3. Create run scripts
with open("start.bat", "w") as f:
    f.write("@echo off\necho Starting VertexML Engine...\ncd backend-core\nstart mvnw spring-boot:run\ncd ../frontend\nstart npm run dev\n")

with open("start.sh", "w") as f:
    f.write("#!/bin/bash\necho 'Starting VertexML Engine...'\ncd backend-core && ./mvnw spring-boot:run &\ncd frontend && npm run dev &\nwait\n")
os.chmod("start.sh", 0o755)

print("Code generation complete!")
