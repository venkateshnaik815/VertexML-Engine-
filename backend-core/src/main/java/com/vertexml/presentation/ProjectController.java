package com.vertexml.presentation;
import com.vertexml.domain.Project;
import com.vertexml.application.ProjectService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;
@RestController @RequestMapping("/api/projects") @CrossOrigin(origins = "*")
public class ProjectController {
    private final ProjectService service;
    public ProjectController(ProjectService service) { this.service = service; }
    @GetMapping public List<Project> getProjects() { return service.getAllProjects(); }
    @PostMapping public Project createProject(@RequestBody Project project) { return service.createProject(project); }
    @DeleteMapping("/{id}") public void deleteProject(@PathVariable UUID id) { service.deleteProject(id); }
}
