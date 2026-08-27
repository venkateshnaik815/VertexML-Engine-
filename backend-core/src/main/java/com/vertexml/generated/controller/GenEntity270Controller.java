package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity270;
import com.vertexml.generated.service.GenEntity270Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen270")
public class GenEntity270Controller {
    private final GenEntity270Service service;
    public GenEntity270Controller(GenEntity270Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity270> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity270 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity270 create(@RequestBody GenEntity270 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity270 update(@PathVariable UUID id, @RequestBody GenEntity270 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
