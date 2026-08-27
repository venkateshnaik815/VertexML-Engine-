package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity157;
import com.vertexml.generated.service.GenEntity157Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen157")
public class GenEntity157Controller {
    private final GenEntity157Service service;
    public GenEntity157Controller(GenEntity157Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity157> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity157 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity157 create(@RequestBody GenEntity157 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity157 update(@PathVariable UUID id, @RequestBody GenEntity157 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
