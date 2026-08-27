package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity137;
import com.vertexml.generated.service.GenEntity137Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen137")
public class GenEntity137Controller {
    private final GenEntity137Service service;
    public GenEntity137Controller(GenEntity137Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity137> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity137 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity137 create(@RequestBody GenEntity137 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity137 update(@PathVariable UUID id, @RequestBody GenEntity137 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
