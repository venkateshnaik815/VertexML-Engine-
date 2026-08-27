package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity69;
import com.vertexml.generated.service.GenEntity69Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen69")
public class GenEntity69Controller {
    private final GenEntity69Service service;
    public GenEntity69Controller(GenEntity69Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity69> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity69 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity69 create(@RequestBody GenEntity69 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity69 update(@PathVariable UUID id, @RequestBody GenEntity69 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
