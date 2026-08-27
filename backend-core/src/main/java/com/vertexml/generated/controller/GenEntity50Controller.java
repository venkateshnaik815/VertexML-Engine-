package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity50;
import com.vertexml.generated.service.GenEntity50Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen50")
public class GenEntity50Controller {
    private final GenEntity50Service service;
    public GenEntity50Controller(GenEntity50Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity50> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity50 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity50 create(@RequestBody GenEntity50 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity50 update(@PathVariable UUID id, @RequestBody GenEntity50 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
