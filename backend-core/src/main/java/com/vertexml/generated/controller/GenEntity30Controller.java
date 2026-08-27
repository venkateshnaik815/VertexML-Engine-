package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity30;
import com.vertexml.generated.service.GenEntity30Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen30")
public class GenEntity30Controller {
    private final GenEntity30Service service;
    public GenEntity30Controller(GenEntity30Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity30> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity30 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity30 create(@RequestBody GenEntity30 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity30 update(@PathVariable UUID id, @RequestBody GenEntity30 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
