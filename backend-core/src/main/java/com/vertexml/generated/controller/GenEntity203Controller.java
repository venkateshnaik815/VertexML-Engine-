package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity203;
import com.vertexml.generated.service.GenEntity203Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen203")
public class GenEntity203Controller {
    private final GenEntity203Service service;
    public GenEntity203Controller(GenEntity203Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity203> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity203 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity203 create(@RequestBody GenEntity203 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity203 update(@PathVariable UUID id, @RequestBody GenEntity203 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
