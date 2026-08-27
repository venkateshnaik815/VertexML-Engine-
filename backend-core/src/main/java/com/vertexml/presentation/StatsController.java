package com.vertexml.presentation;
import com.vertexml.domain.ProjectRepository;
import com.vertexml.domain.DatasetRepository;
import com.vertexml.domain.ModelRepository;
import com.vertexml.domain.EndpointRepository;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
import java.util.HashMap;
@RestController @RequestMapping("/api/stats") @CrossOrigin(origins = "*")
public class StatsController {
    private final ProjectRepository p;
    private final DatasetRepository d;
    private final ModelRepository m;
    private final EndpointRepository e;
    public StatsController(ProjectRepository p, DatasetRepository d, ModelRepository m, EndpointRepository e) { this.p = p; this.d = d; this.m = m; this.e = e; }
    @GetMapping public Map<String, Long> getStats() {
        Map<String, Long> stats = new HashMap<>();
        stats.put("projects", p.count());
        stats.put("datasets", d.count());
        stats.put("models", m.count());
        stats.put("endpoints", e.count());
        return stats;
    }
}
