package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity252;
import com.vertexml.generated.service.GenEntity252Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen252")
public class GenEntity252Controller {
    private final GenEntity252Service service;
    public GenEntity252Controller(GenEntity252Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity252> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity252 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity252 create(@RequestBody GenEntity252 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity252 update(@PathVariable UUID id, @RequestBody GenEntity252 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
