package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity124;
import com.vertexml.generated.service.GenEntity124Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen124")
public class GenEntity124Controller {
    private final GenEntity124Service service;
    public GenEntity124Controller(GenEntity124Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity124> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity124 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity124 create(@RequestBody GenEntity124 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity124 update(@PathVariable UUID id, @RequestBody GenEntity124 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
