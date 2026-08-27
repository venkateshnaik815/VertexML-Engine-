package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity97;
import com.vertexml.generated.service.GenEntity97Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen97")
public class GenEntity97Controller {
    private final GenEntity97Service service;
    public GenEntity97Controller(GenEntity97Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity97> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity97 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity97 create(@RequestBody GenEntity97 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity97 update(@PathVariable UUID id, @RequestBody GenEntity97 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
