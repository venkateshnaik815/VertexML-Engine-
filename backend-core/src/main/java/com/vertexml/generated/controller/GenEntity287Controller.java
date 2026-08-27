package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity287;
import com.vertexml.generated.service.GenEntity287Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen287")
public class GenEntity287Controller {
    private final GenEntity287Service service;
    public GenEntity287Controller(GenEntity287Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity287> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity287 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity287 create(@RequestBody GenEntity287 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity287 update(@PathVariable UUID id, @RequestBody GenEntity287 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
