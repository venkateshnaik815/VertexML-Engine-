package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity60;
import com.vertexml.generated.service.GenEntity60Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen60")
public class GenEntity60Controller {
    private final GenEntity60Service service;
    public GenEntity60Controller(GenEntity60Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity60> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity60 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity60 create(@RequestBody GenEntity60 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity60 update(@PathVariable UUID id, @RequestBody GenEntity60 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
