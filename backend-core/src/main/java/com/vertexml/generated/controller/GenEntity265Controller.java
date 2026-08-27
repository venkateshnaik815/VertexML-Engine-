package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity265;
import com.vertexml.generated.service.GenEntity265Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen265")
public class GenEntity265Controller {
    private final GenEntity265Service service;
    public GenEntity265Controller(GenEntity265Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity265> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity265 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity265 create(@RequestBody GenEntity265 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity265 update(@PathVariable UUID id, @RequestBody GenEntity265 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
