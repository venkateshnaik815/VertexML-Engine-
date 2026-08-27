package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity166;
import com.vertexml.generated.service.GenEntity166Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen166")
public class GenEntity166Controller {
    private final GenEntity166Service service;
    public GenEntity166Controller(GenEntity166Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity166> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity166 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity166 create(@RequestBody GenEntity166 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity166 update(@PathVariable UUID id, @RequestBody GenEntity166 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
