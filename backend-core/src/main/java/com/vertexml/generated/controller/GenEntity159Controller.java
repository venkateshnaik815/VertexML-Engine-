package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity159;
import com.vertexml.generated.service.GenEntity159Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen159")
public class GenEntity159Controller {
    private final GenEntity159Service service;
    public GenEntity159Controller(GenEntity159Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity159> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity159 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity159 create(@RequestBody GenEntity159 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity159 update(@PathVariable UUID id, @RequestBody GenEntity159 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
