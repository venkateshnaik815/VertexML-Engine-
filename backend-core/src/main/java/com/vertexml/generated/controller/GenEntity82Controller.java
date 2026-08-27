package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity82;
import com.vertexml.generated.service.GenEntity82Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen82")
public class GenEntity82Controller {
    private final GenEntity82Service service;
    public GenEntity82Controller(GenEntity82Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity82> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity82 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity82 create(@RequestBody GenEntity82 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity82 update(@PathVariable UUID id, @RequestBody GenEntity82 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
