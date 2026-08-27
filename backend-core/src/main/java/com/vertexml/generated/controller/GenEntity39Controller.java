package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity39;
import com.vertexml.generated.service.GenEntity39Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen39")
public class GenEntity39Controller {
    private final GenEntity39Service service;
    public GenEntity39Controller(GenEntity39Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity39> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity39 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity39 create(@RequestBody GenEntity39 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity39 update(@PathVariable UUID id, @RequestBody GenEntity39 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
