package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity140;
import com.vertexml.generated.service.GenEntity140Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen140")
public class GenEntity140Controller {
    private final GenEntity140Service service;
    public GenEntity140Controller(GenEntity140Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity140> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity140 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity140 create(@RequestBody GenEntity140 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity140 update(@PathVariable UUID id, @RequestBody GenEntity140 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
