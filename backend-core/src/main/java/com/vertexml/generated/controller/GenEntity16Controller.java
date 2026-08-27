package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity16;
import com.vertexml.generated.service.GenEntity16Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen16")
public class GenEntity16Controller {
    private final GenEntity16Service service;
    public GenEntity16Controller(GenEntity16Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity16> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity16 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity16 create(@RequestBody GenEntity16 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity16 update(@PathVariable UUID id, @RequestBody GenEntity16 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
