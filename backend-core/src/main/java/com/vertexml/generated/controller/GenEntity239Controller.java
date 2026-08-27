package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity239;
import com.vertexml.generated.service.GenEntity239Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen239")
public class GenEntity239Controller {
    private final GenEntity239Service service;
    public GenEntity239Controller(GenEntity239Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity239> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity239 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity239 create(@RequestBody GenEntity239 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity239 update(@PathVariable UUID id, @RequestBody GenEntity239 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
