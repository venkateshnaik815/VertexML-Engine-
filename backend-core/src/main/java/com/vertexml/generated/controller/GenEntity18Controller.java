package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity18;
import com.vertexml.generated.service.GenEntity18Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen18")
public class GenEntity18Controller {
    private final GenEntity18Service service;
    public GenEntity18Controller(GenEntity18Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity18> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity18 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity18 create(@RequestBody GenEntity18 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity18 update(@PathVariable UUID id, @RequestBody GenEntity18 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
