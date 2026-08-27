package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity158;
import com.vertexml.generated.service.GenEntity158Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen158")
public class GenEntity158Controller {
    private final GenEntity158Service service;
    public GenEntity158Controller(GenEntity158Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity158> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity158 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity158 create(@RequestBody GenEntity158 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity158 update(@PathVariable UUID id, @RequestBody GenEntity158 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
