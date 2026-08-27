package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity145;
import com.vertexml.generated.service.GenEntity145Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen145")
public class GenEntity145Controller {
    private final GenEntity145Service service;
    public GenEntity145Controller(GenEntity145Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity145> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity145 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity145 create(@RequestBody GenEntity145 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity145 update(@PathVariable UUID id, @RequestBody GenEntity145 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
