package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity38;
import com.vertexml.generated.service.GenEntity38Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen38")
public class GenEntity38Controller {
    private final GenEntity38Service service;
    public GenEntity38Controller(GenEntity38Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity38> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity38 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity38 create(@RequestBody GenEntity38 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity38 update(@PathVariable UUID id, @RequestBody GenEntity38 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
