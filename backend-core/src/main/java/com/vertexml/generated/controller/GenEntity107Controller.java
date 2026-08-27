package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity107;
import com.vertexml.generated.service.GenEntity107Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen107")
public class GenEntity107Controller {
    private final GenEntity107Service service;
    public GenEntity107Controller(GenEntity107Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity107> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity107 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity107 create(@RequestBody GenEntity107 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity107 update(@PathVariable UUID id, @RequestBody GenEntity107 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
