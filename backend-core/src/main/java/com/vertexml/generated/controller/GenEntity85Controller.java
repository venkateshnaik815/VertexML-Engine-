package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity85;
import com.vertexml.generated.service.GenEntity85Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen85")
public class GenEntity85Controller {
    private final GenEntity85Service service;
    public GenEntity85Controller(GenEntity85Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity85> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity85 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity85 create(@RequestBody GenEntity85 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity85 update(@PathVariable UUID id, @RequestBody GenEntity85 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
