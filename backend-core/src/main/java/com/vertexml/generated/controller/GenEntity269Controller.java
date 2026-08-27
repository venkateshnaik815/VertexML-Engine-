package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity269;
import com.vertexml.generated.service.GenEntity269Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen269")
public class GenEntity269Controller {
    private final GenEntity269Service service;
    public GenEntity269Controller(GenEntity269Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity269> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity269 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity269 create(@RequestBody GenEntity269 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity269 update(@PathVariable UUID id, @RequestBody GenEntity269 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
