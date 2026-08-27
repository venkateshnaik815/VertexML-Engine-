package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity266;
import com.vertexml.generated.service.GenEntity266Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen266")
public class GenEntity266Controller {
    private final GenEntity266Service service;
    public GenEntity266Controller(GenEntity266Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity266> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity266 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity266 create(@RequestBody GenEntity266 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity266 update(@PathVariable UUID id, @RequestBody GenEntity266 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
