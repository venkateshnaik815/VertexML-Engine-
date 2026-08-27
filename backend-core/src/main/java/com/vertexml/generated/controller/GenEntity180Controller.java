package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity180;
import com.vertexml.generated.service.GenEntity180Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen180")
public class GenEntity180Controller {
    private final GenEntity180Service service;
    public GenEntity180Controller(GenEntity180Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity180> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity180 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity180 create(@RequestBody GenEntity180 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity180 update(@PathVariable UUID id, @RequestBody GenEntity180 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
