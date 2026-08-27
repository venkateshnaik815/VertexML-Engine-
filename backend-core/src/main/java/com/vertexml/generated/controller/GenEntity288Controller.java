package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity288;
import com.vertexml.generated.service.GenEntity288Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen288")
public class GenEntity288Controller {
    private final GenEntity288Service service;
    public GenEntity288Controller(GenEntity288Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity288> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity288 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity288 create(@RequestBody GenEntity288 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity288 update(@PathVariable UUID id, @RequestBody GenEntity288 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
