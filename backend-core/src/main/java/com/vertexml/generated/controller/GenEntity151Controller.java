package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity151;
import com.vertexml.generated.service.GenEntity151Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen151")
public class GenEntity151Controller {
    private final GenEntity151Service service;
    public GenEntity151Controller(GenEntity151Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity151> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity151 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity151 create(@RequestBody GenEntity151 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity151 update(@PathVariable UUID id, @RequestBody GenEntity151 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
