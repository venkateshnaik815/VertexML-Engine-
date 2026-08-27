package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity262;
import com.vertexml.generated.service.GenEntity262Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen262")
public class GenEntity262Controller {
    private final GenEntity262Service service;
    public GenEntity262Controller(GenEntity262Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity262> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity262 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity262 create(@RequestBody GenEntity262 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity262 update(@PathVariable UUID id, @RequestBody GenEntity262 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
