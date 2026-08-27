package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity120;
import com.vertexml.generated.service.GenEntity120Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen120")
public class GenEntity120Controller {
    private final GenEntity120Service service;
    public GenEntity120Controller(GenEntity120Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity120> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity120 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity120 create(@RequestBody GenEntity120 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity120 update(@PathVariable UUID id, @RequestBody GenEntity120 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
