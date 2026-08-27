package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity123;
import com.vertexml.generated.service.GenEntity123Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen123")
public class GenEntity123Controller {
    private final GenEntity123Service service;
    public GenEntity123Controller(GenEntity123Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity123> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity123 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity123 create(@RequestBody GenEntity123 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity123 update(@PathVariable UUID id, @RequestBody GenEntity123 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
