package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity48;
import com.vertexml.generated.service.GenEntity48Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen48")
public class GenEntity48Controller {
    private final GenEntity48Service service;
    public GenEntity48Controller(GenEntity48Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity48> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity48 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity48 create(@RequestBody GenEntity48 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity48 update(@PathVariable UUID id, @RequestBody GenEntity48 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
