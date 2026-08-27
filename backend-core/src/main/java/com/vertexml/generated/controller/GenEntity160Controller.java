package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity160;
import com.vertexml.generated.service.GenEntity160Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen160")
public class GenEntity160Controller {
    private final GenEntity160Service service;
    public GenEntity160Controller(GenEntity160Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity160> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity160 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity160 create(@RequestBody GenEntity160 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity160 update(@PathVariable UUID id, @RequestBody GenEntity160 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
