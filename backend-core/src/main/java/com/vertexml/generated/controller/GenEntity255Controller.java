package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity255;
import com.vertexml.generated.service.GenEntity255Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen255")
public class GenEntity255Controller {
    private final GenEntity255Service service;
    public GenEntity255Controller(GenEntity255Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity255> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity255 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity255 create(@RequestBody GenEntity255 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity255 update(@PathVariable UUID id, @RequestBody GenEntity255 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
