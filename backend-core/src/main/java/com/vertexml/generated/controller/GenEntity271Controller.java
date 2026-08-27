package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity271;
import com.vertexml.generated.service.GenEntity271Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen271")
public class GenEntity271Controller {
    private final GenEntity271Service service;
    public GenEntity271Controller(GenEntity271Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity271> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity271 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity271 create(@RequestBody GenEntity271 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity271 update(@PathVariable UUID id, @RequestBody GenEntity271 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
