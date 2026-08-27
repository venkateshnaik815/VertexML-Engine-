package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity179;
import com.vertexml.generated.service.GenEntity179Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen179")
public class GenEntity179Controller {
    private final GenEntity179Service service;
    public GenEntity179Controller(GenEntity179Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity179> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity179 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity179 create(@RequestBody GenEntity179 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity179 update(@PathVariable UUID id, @RequestBody GenEntity179 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
