package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity1;
import com.vertexml.generated.service.GenEntity1Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen1")
public class GenEntity1Controller {
    private final GenEntity1Service service;
    public GenEntity1Controller(GenEntity1Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity1> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity1 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity1 create(@RequestBody GenEntity1 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity1 update(@PathVariable UUID id, @RequestBody GenEntity1 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
