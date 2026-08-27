package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity188;
import com.vertexml.generated.service.GenEntity188Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen188")
public class GenEntity188Controller {
    private final GenEntity188Service service;
    public GenEntity188Controller(GenEntity188Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity188> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity188 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity188 create(@RequestBody GenEntity188 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity188 update(@PathVariable UUID id, @RequestBody GenEntity188 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
