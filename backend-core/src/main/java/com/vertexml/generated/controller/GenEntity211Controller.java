package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity211;
import com.vertexml.generated.service.GenEntity211Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen211")
public class GenEntity211Controller {
    private final GenEntity211Service service;
    public GenEntity211Controller(GenEntity211Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity211> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity211 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity211 create(@RequestBody GenEntity211 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity211 update(@PathVariable UUID id, @RequestBody GenEntity211 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
