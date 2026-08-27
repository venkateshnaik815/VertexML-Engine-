package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity104;
import com.vertexml.generated.service.GenEntity104Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen104")
public class GenEntity104Controller {
    private final GenEntity104Service service;
    public GenEntity104Controller(GenEntity104Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity104> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity104 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity104 create(@RequestBody GenEntity104 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity104 update(@PathVariable UUID id, @RequestBody GenEntity104 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
