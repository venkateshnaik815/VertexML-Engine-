package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity49;
import com.vertexml.generated.service.GenEntity49Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen49")
public class GenEntity49Controller {
    private final GenEntity49Service service;
    public GenEntity49Controller(GenEntity49Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity49> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity49 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity49 create(@RequestBody GenEntity49 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity49 update(@PathVariable UUID id, @RequestBody GenEntity49 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
