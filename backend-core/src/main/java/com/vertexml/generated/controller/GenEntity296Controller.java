package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity296;
import com.vertexml.generated.service.GenEntity296Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen296")
public class GenEntity296Controller {
    private final GenEntity296Service service;
    public GenEntity296Controller(GenEntity296Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity296> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity296 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity296 create(@RequestBody GenEntity296 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity296 update(@PathVariable UUID id, @RequestBody GenEntity296 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
