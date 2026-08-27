package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity23;
import com.vertexml.generated.service.GenEntity23Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen23")
public class GenEntity23Controller {
    private final GenEntity23Service service;
    public GenEntity23Controller(GenEntity23Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity23> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity23 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity23 create(@RequestBody GenEntity23 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity23 update(@PathVariable UUID id, @RequestBody GenEntity23 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
