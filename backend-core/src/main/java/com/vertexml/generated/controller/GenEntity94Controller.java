package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity94;
import com.vertexml.generated.service.GenEntity94Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen94")
public class GenEntity94Controller {
    private final GenEntity94Service service;
    public GenEntity94Controller(GenEntity94Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity94> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity94 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity94 create(@RequestBody GenEntity94 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity94 update(@PathVariable UUID id, @RequestBody GenEntity94 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
