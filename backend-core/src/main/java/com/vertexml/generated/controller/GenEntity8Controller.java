package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity8;
import com.vertexml.generated.service.GenEntity8Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen8")
public class GenEntity8Controller {
    private final GenEntity8Service service;
    public GenEntity8Controller(GenEntity8Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity8> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity8 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity8 create(@RequestBody GenEntity8 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity8 update(@PathVariable UUID id, @RequestBody GenEntity8 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
