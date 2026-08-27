package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity275;
import com.vertexml.generated.service.GenEntity275Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen275")
public class GenEntity275Controller {
    private final GenEntity275Service service;
    public GenEntity275Controller(GenEntity275Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity275> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity275 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity275 create(@RequestBody GenEntity275 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity275 update(@PathVariable UUID id, @RequestBody GenEntity275 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
