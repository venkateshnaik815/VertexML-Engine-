package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity232;
import com.vertexml.generated.service.GenEntity232Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen232")
public class GenEntity232Controller {
    private final GenEntity232Service service;
    public GenEntity232Controller(GenEntity232Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity232> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity232 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity232 create(@RequestBody GenEntity232 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity232 update(@PathVariable UUID id, @RequestBody GenEntity232 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
