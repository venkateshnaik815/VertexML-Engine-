package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity146;
import com.vertexml.generated.service.GenEntity146Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen146")
public class GenEntity146Controller {
    private final GenEntity146Service service;
    public GenEntity146Controller(GenEntity146Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity146> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity146 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity146 create(@RequestBody GenEntity146 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity146 update(@PathVariable UUID id, @RequestBody GenEntity146 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
