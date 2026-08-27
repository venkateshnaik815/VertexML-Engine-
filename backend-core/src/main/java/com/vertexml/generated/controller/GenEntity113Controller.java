package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity113;
import com.vertexml.generated.service.GenEntity113Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen113")
public class GenEntity113Controller {
    private final GenEntity113Service service;
    public GenEntity113Controller(GenEntity113Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity113> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity113 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity113 create(@RequestBody GenEntity113 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity113 update(@PathVariable UUID id, @RequestBody GenEntity113 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
