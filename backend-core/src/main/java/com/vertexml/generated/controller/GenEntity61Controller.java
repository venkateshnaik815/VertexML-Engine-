package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity61;
import com.vertexml.generated.service.GenEntity61Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen61")
public class GenEntity61Controller {
    private final GenEntity61Service service;
    public GenEntity61Controller(GenEntity61Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity61> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity61 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity61 create(@RequestBody GenEntity61 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity61 update(@PathVariable UUID id, @RequestBody GenEntity61 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
