package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity192;
import com.vertexml.generated.service.GenEntity192Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen192")
public class GenEntity192Controller {
    private final GenEntity192Service service;
    public GenEntity192Controller(GenEntity192Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity192> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity192 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity192 create(@RequestBody GenEntity192 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity192 update(@PathVariable UUID id, @RequestBody GenEntity192 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
