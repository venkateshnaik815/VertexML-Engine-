package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity114;
import com.vertexml.generated.service.GenEntity114Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen114")
public class GenEntity114Controller {
    private final GenEntity114Service service;
    public GenEntity114Controller(GenEntity114Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity114> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity114 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity114 create(@RequestBody GenEntity114 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity114 update(@PathVariable UUID id, @RequestBody GenEntity114 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
