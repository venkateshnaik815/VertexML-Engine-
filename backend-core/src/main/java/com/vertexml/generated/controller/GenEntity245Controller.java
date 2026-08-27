package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity245;
import com.vertexml.generated.service.GenEntity245Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen245")
public class GenEntity245Controller {
    private final GenEntity245Service service;
    public GenEntity245Controller(GenEntity245Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity245> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity245 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity245 create(@RequestBody GenEntity245 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity245 update(@PathVariable UUID id, @RequestBody GenEntity245 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
