package com.vertexml.presentation;
import com.vertexml.domain.Model;
import com.vertexml.domain.ModelRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;
@RestController @RequestMapping("/api/models") @CrossOrigin(origins = "*")
public class ModelController {
    private final ModelRepository repo;
    public ModelController(ModelRepository repo) { this.repo = repo; }
    @GetMapping public List<Model> getAll() { return repo.findAll(); }
    @PostMapping public Model create(@RequestBody Model m) { return repo.save(m); }
    @DeleteMapping("/{id}") public void delete(@PathVariable UUID id) { repo.deleteById(id); }
}
