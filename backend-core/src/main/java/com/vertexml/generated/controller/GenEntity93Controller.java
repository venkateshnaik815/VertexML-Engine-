package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity93;
import com.vertexml.generated.service.GenEntity93Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen93")
public class GenEntity93Controller {
    private final GenEntity93Service service;
    public GenEntity93Controller(GenEntity93Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity93> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity93 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity93 create(@RequestBody GenEntity93 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity93 update(@PathVariable UUID id, @RequestBody GenEntity93 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
