package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity213;
import com.vertexml.generated.service.GenEntity213Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen213")
public class GenEntity213Controller {
    private final GenEntity213Service service;
    public GenEntity213Controller(GenEntity213Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity213> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity213 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity213 create(@RequestBody GenEntity213 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity213 update(@PathVariable UUID id, @RequestBody GenEntity213 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
