package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity20;
import com.vertexml.generated.service.GenEntity20Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen20")
public class GenEntity20Controller {
    private final GenEntity20Service service;
    public GenEntity20Controller(GenEntity20Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity20> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity20 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity20 create(@RequestBody GenEntity20 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity20 update(@PathVariable UUID id, @RequestBody GenEntity20 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
