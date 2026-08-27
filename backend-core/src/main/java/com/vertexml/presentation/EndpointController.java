package com.vertexml.presentation;
import com.vertexml.domain.Endpoint;
import com.vertexml.domain.EndpointRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;
@RestController @RequestMapping("/api/endpoints") @CrossOrigin(origins = "*")
public class EndpointController {
    private final EndpointRepository repo;
    public EndpointController(EndpointRepository repo) { this.repo = repo; }
    @GetMapping public List<Endpoint> getAll() { return repo.findAll(); }
    @PostMapping public Endpoint create(@RequestBody Endpoint e) { return repo.save(e); }
    @DeleteMapping("/{id}") public void delete(@PathVariable UUID id) { repo.deleteById(id); }
}
