package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity230;
import com.vertexml.generated.service.GenEntity230Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen230")
public class GenEntity230Controller {
    private final GenEntity230Service service;
    public GenEntity230Controller(GenEntity230Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity230> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity230 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity230 create(@RequestBody GenEntity230 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity230 update(@PathVariable UUID id, @RequestBody GenEntity230 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
