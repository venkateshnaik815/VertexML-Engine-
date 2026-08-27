package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity298;
import com.vertexml.generated.service.GenEntity298Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen298")
public class GenEntity298Controller {
    private final GenEntity298Service service;
    public GenEntity298Controller(GenEntity298Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity298> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity298 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity298 create(@RequestBody GenEntity298 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity298 update(@PathVariable UUID id, @RequestBody GenEntity298 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
