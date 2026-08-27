package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity125;
import com.vertexml.generated.service.GenEntity125Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen125")
public class GenEntity125Controller {
    private final GenEntity125Service service;
    public GenEntity125Controller(GenEntity125Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity125> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity125 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity125 create(@RequestBody GenEntity125 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity125 update(@PathVariable UUID id, @RequestBody GenEntity125 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
