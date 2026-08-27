package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity161;
import com.vertexml.generated.service.GenEntity161Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen161")
public class GenEntity161Controller {
    private final GenEntity161Service service;
    public GenEntity161Controller(GenEntity161Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity161> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity161 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity161 create(@RequestBody GenEntity161 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity161 update(@PathVariable UUID id, @RequestBody GenEntity161 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
