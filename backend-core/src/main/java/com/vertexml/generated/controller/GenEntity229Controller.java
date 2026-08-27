package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity229;
import com.vertexml.generated.service.GenEntity229Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen229")
public class GenEntity229Controller {
    private final GenEntity229Service service;
    public GenEntity229Controller(GenEntity229Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity229> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity229 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity229 create(@RequestBody GenEntity229 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity229 update(@PathVariable UUID id, @RequestBody GenEntity229 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
