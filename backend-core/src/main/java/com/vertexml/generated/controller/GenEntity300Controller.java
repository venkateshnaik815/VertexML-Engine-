package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity300;
import com.vertexml.generated.service.GenEntity300Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen300")
public class GenEntity300Controller {
    private final GenEntity300Service service;
    public GenEntity300Controller(GenEntity300Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity300> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity300 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity300 create(@RequestBody GenEntity300 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity300 update(@PathVariable UUID id, @RequestBody GenEntity300 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
