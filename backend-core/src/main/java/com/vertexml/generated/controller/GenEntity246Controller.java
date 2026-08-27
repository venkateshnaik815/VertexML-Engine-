package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity246;
import com.vertexml.generated.service.GenEntity246Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen246")
public class GenEntity246Controller {
    private final GenEntity246Service service;
    public GenEntity246Controller(GenEntity246Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity246> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity246 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity246 create(@RequestBody GenEntity246 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity246 update(@PathVariable UUID id, @RequestBody GenEntity246 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
