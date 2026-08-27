package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity290;
import com.vertexml.generated.service.GenEntity290Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen290")
public class GenEntity290Controller {
    private final GenEntity290Service service;
    public GenEntity290Controller(GenEntity290Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity290> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity290 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity290 create(@RequestBody GenEntity290 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity290 update(@PathVariable UUID id, @RequestBody GenEntity290 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
