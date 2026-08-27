package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity199;
import com.vertexml.generated.service.GenEntity199Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen199")
public class GenEntity199Controller {
    private final GenEntity199Service service;
    public GenEntity199Controller(GenEntity199Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity199> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity199 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity199 create(@RequestBody GenEntity199 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity199 update(@PathVariable UUID id, @RequestBody GenEntity199 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
