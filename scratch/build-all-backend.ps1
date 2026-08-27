$backend_dir = "backend-core/src/main/java/com/vertexml"
$frontend_dir = "frontend/src"

function Write-File {
    param([string]$Path, [string]$Content)
    $dir = Split-Path $Path
    if (-not (Test-Path $dir)) {
        New-Item -ItemType Directory -Force -Path $dir | Out-Null
    }
    Set-Content -Path $Path -Value $Content
}

# 1. Expand Backend for Endpoints
Write-File "$backend_dir/domain/Endpoint.java" "package com.vertexml.domain;`nimport jakarta.persistence.*;`nimport lombok.Data;`nimport java.util.UUID;`n@Entity @Data @Table(name=`"endpoints`") public class Endpoint { @Id @GeneratedValue(strategy=GenerationType.UUID) private UUID id; private String name; }"
Write-File "$backend_dir/domain/EndpointRepository.java" "package com.vertexml.domain;`nimport org.springframework.data.jpa.repository.JpaRepository;`nimport java.util.UUID;`npublic interface EndpointRepository extends JpaRepository<Endpoint, UUID> {}"
Write-File "$backend_dir/presentation/EndpointController.java" "package com.vertexml.presentation;`nimport com.vertexml.domain.Endpoint;`nimport com.vertexml.domain.EndpointRepository;`nimport org.springframework.web.bind.annotation.*;`nimport java.util.List;`nimport java.util.UUID;`n@RestController @RequestMapping(`/`"/api/endpoints`/`") @CrossOrigin(origins = `/`"*`/`")`npublic class EndpointController {`n    private final EndpointRepository repo;`n    public EndpointController(EndpointRepository repo) { this.repo = repo; }`n    @GetMapping public List<Endpoint> getAll() { return repo.findAll(); }`n    @PostMapping public Endpoint create(@RequestBody Endpoint e) { return repo.save(e); }`n    @DeleteMapping(`/`"/{id}`/`") public void delete(@PathVariable UUID id) { repo.deleteById(id); }`n}"

# 2. Add Stats Controller
Write-File "$backend_dir/presentation/StatsController.java" "package com.vertexml.presentation;
import com.vertexml.domain.ProjectRepository;
import com.vertexml.domain.DatasetRepository;
import com.vertexml.domain.ModelRepository;
import com.vertexml.domain.EndpointRepository;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
import java.util.HashMap;
@RestController @RequestMapping(`"/api/stats`") @CrossOrigin(origins = `"*`")
public class StatsController {
    private final ProjectRepository p;
    private final DatasetRepository d;
    private final ModelRepository m;
    private final EndpointRepository e;
    public StatsController(ProjectRepository p, DatasetRepository d, ModelRepository m, EndpointRepository e) { this.p = p; this.d = d; this.m = m; this.e = e; }
    @GetMapping public Map<String, Long> getStats() {
        Map<String, Long> stats = new HashMap<>();
        stats.put(`"projects`", p.count());
        stats.put(`"datasets`", d.count());
        stats.put(`"models`", m.count());
        stats.put(`"endpoints`", e.count());
        return stats;
    }
}"
