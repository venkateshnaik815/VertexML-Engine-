package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity139;
import com.vertexml.generated.service.GenEntity139Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen139")
public class GenEntity139Controller {
    private final GenEntity139Service service;
    public GenEntity139Controller(GenEntity139Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity139> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity139 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity139 create(@RequestBody GenEntity139 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity139 update(@PathVariable UUID id, @RequestBody GenEntity139 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
