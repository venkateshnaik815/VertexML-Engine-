package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity220;
import com.vertexml.generated.service.GenEntity220Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen220")
public class GenEntity220Controller {
    private final GenEntity220Service service;
    public GenEntity220Controller(GenEntity220Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity220> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity220 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity220 create(@RequestBody GenEntity220 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity220 update(@PathVariable UUID id, @RequestBody GenEntity220 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
