package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity237;
import com.vertexml.generated.service.GenEntity237Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen237")
public class GenEntity237Controller {
    private final GenEntity237Service service;
    public GenEntity237Controller(GenEntity237Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity237> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity237 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity237 create(@RequestBody GenEntity237 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity237 update(@PathVariable UUID id, @RequestBody GenEntity237 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
