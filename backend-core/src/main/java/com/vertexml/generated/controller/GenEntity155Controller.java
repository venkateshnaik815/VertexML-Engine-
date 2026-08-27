package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity155;
import com.vertexml.generated.service.GenEntity155Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen155")
public class GenEntity155Controller {
    private final GenEntity155Service service;
    public GenEntity155Controller(GenEntity155Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity155> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity155 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity155 create(@RequestBody GenEntity155 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity155 update(@PathVariable UUID id, @RequestBody GenEntity155 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
