package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity264;
import com.vertexml.generated.service.GenEntity264Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen264")
public class GenEntity264Controller {
    private final GenEntity264Service service;
    public GenEntity264Controller(GenEntity264Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity264> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity264 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity264 create(@RequestBody GenEntity264 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity264 update(@PathVariable UUID id, @RequestBody GenEntity264 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
