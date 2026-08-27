package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity74;
import com.vertexml.generated.service.GenEntity74Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen74")
public class GenEntity74Controller {
    private final GenEntity74Service service;
    public GenEntity74Controller(GenEntity74Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity74> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity74 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity74 create(@RequestBody GenEntity74 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity74 update(@PathVariable UUID id, @RequestBody GenEntity74 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
