package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity75;
import com.vertexml.generated.service.GenEntity75Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen75")
public class GenEntity75Controller {
    private final GenEntity75Service service;
    public GenEntity75Controller(GenEntity75Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity75> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity75 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity75 create(@RequestBody GenEntity75 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity75 update(@PathVariable UUID id, @RequestBody GenEntity75 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
