package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity260;
import com.vertexml.generated.service.GenEntity260Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen260")
public class GenEntity260Controller {
    private final GenEntity260Service service;
    public GenEntity260Controller(GenEntity260Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity260> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity260 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity260 create(@RequestBody GenEntity260 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity260 update(@PathVariable UUID id, @RequestBody GenEntity260 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
