package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity274;
import com.vertexml.generated.service.GenEntity274Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen274")
public class GenEntity274Controller {
    private final GenEntity274Service service;
    public GenEntity274Controller(GenEntity274Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity274> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity274 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity274 create(@RequestBody GenEntity274 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity274 update(@PathVariable UUID id, @RequestBody GenEntity274 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
