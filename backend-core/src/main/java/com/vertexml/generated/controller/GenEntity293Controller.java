package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity293;
import com.vertexml.generated.service.GenEntity293Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen293")
public class GenEntity293Controller {
    private final GenEntity293Service service;
    public GenEntity293Controller(GenEntity293Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity293> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity293 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity293 create(@RequestBody GenEntity293 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity293 update(@PathVariable UUID id, @RequestBody GenEntity293 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
