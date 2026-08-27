package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity231;
import com.vertexml.generated.service.GenEntity231Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen231")
public class GenEntity231Controller {
    private final GenEntity231Service service;
    public GenEntity231Controller(GenEntity231Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity231> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity231 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity231 create(@RequestBody GenEntity231 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity231 update(@PathVariable UUID id, @RequestBody GenEntity231 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
