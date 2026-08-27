package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity263;
import com.vertexml.generated.service.GenEntity263Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen263")
public class GenEntity263Controller {
    private final GenEntity263Service service;
    public GenEntity263Controller(GenEntity263Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity263> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity263 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity263 create(@RequestBody GenEntity263 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity263 update(@PathVariable UUID id, @RequestBody GenEntity263 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
