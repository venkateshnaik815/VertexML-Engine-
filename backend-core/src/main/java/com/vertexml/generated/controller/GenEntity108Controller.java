package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity108;
import com.vertexml.generated.service.GenEntity108Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen108")
public class GenEntity108Controller {
    private final GenEntity108Service service;
    public GenEntity108Controller(GenEntity108Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity108> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity108 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity108 create(@RequestBody GenEntity108 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity108 update(@PathVariable UUID id, @RequestBody GenEntity108 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
