package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity207;
import com.vertexml.generated.service.GenEntity207Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen207")
public class GenEntity207Controller {
    private final GenEntity207Service service;
    public GenEntity207Controller(GenEntity207Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity207> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity207 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity207 create(@RequestBody GenEntity207 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity207 update(@PathVariable UUID id, @RequestBody GenEntity207 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
