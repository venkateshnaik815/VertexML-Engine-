package com.vertexml.presentation;
import com.vertexml.domain.Dataset;
import com.vertexml.domain.DatasetRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;
@RestController @RequestMapping("/api/datasets") @CrossOrigin(origins = "*")
public class DatasetController {
    private final DatasetRepository repo;
    public DatasetController(DatasetRepository repo) { this.repo = repo; }
    @GetMapping public List<Dataset> getAll() { return repo.findAll(); }
    @PostMapping public Dataset create(@RequestBody Dataset d) { return repo.save(d); }
    @DeleteMapping("/{id}") public void delete(@PathVariable UUID id) { repo.deleteById(id); }
}
