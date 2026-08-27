package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity268;
import com.vertexml.generated.service.GenEntity268Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen268")
public class GenEntity268Controller {
    private final GenEntity268Service service;
    public GenEntity268Controller(GenEntity268Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity268> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity268 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity268 create(@RequestBody GenEntity268 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity268 update(@PathVariable UUID id, @RequestBody GenEntity268 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
