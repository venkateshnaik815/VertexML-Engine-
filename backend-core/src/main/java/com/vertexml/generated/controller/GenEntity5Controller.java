package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity5;
import com.vertexml.generated.service.GenEntity5Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen5")
public class GenEntity5Controller {
    private final GenEntity5Service service;
    public GenEntity5Controller(GenEntity5Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity5> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity5 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity5 create(@RequestBody GenEntity5 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity5 update(@PathVariable UUID id, @RequestBody GenEntity5 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
