package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity92;
import com.vertexml.generated.service.GenEntity92Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen92")
public class GenEntity92Controller {
    private final GenEntity92Service service;
    public GenEntity92Controller(GenEntity92Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity92> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity92 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity92 create(@RequestBody GenEntity92 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity92 update(@PathVariable UUID id, @RequestBody GenEntity92 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
