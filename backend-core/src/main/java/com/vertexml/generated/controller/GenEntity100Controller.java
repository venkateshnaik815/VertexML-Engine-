package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity100;
import com.vertexml.generated.service.GenEntity100Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen100")
public class GenEntity100Controller {
    private final GenEntity100Service service;
    public GenEntity100Controller(GenEntity100Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity100> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity100 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity100 create(@RequestBody GenEntity100 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity100 update(@PathVariable UUID id, @RequestBody GenEntity100 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
