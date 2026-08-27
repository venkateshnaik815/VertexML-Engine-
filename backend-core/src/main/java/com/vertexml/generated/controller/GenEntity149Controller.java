package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity149;
import com.vertexml.generated.service.GenEntity149Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen149")
public class GenEntity149Controller {
    private final GenEntity149Service service;
    public GenEntity149Controller(GenEntity149Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity149> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity149 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity149 create(@RequestBody GenEntity149 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity149 update(@PathVariable UUID id, @RequestBody GenEntity149 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
