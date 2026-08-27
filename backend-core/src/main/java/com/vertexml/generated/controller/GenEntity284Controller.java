package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity284;
import com.vertexml.generated.service.GenEntity284Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen284")
public class GenEntity284Controller {
    private final GenEntity284Service service;
    public GenEntity284Controller(GenEntity284Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity284> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity284 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity284 create(@RequestBody GenEntity284 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity284 update(@PathVariable UUID id, @RequestBody GenEntity284 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
