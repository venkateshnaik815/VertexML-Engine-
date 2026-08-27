package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity80;
import com.vertexml.generated.service.GenEntity80Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen80")
public class GenEntity80Controller {
    private final GenEntity80Service service;
    public GenEntity80Controller(GenEntity80Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity80> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity80 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity80 create(@RequestBody GenEntity80 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity80 update(@PathVariable UUID id, @RequestBody GenEntity80 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
