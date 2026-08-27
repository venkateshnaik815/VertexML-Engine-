package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity172;
import com.vertexml.generated.service.GenEntity172Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen172")
public class GenEntity172Controller {
    private final GenEntity172Service service;
    public GenEntity172Controller(GenEntity172Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity172> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity172 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity172 create(@RequestBody GenEntity172 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity172 update(@PathVariable UUID id, @RequestBody GenEntity172 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
