package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity36;
import com.vertexml.generated.service.GenEntity36Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen36")
public class GenEntity36Controller {
    private final GenEntity36Service service;
    public GenEntity36Controller(GenEntity36Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity36> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity36 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity36 create(@RequestBody GenEntity36 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity36 update(@PathVariable UUID id, @RequestBody GenEntity36 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
