package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity177;
import com.vertexml.generated.service.GenEntity177Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen177")
public class GenEntity177Controller {
    private final GenEntity177Service service;
    public GenEntity177Controller(GenEntity177Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity177> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity177 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity177 create(@RequestBody GenEntity177 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity177 update(@PathVariable UUID id, @RequestBody GenEntity177 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
