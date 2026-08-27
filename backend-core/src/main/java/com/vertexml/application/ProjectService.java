package com.vertexml.application;
import com.vertexml.domain.Project;
import com.vertexml.domain.ProjectRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;
@Service
public class ProjectService {
    private final ProjectRepository repository;
    public ProjectService(ProjectRepository repository) { this.repository = repository; }
    public List<Project> getAllProjects() { return repository.findAll(); }
    public Project createProject(Project project) { return repository.save(project); }
    public void deleteProject(UUID id) { repository.deleteById(id); }
}
