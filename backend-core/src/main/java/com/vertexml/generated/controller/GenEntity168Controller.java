package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity168;
import com.vertexml.generated.service.GenEntity168Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen168")
public class GenEntity168Controller {
    private final GenEntity168Service service;
    public GenEntity168Controller(GenEntity168Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity168> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity168 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity168 create(@RequestBody GenEntity168 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity168 update(@PathVariable UUID id, @RequestBody GenEntity168 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
