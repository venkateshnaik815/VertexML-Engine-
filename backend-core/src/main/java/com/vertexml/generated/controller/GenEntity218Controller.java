package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity218;
import com.vertexml.generated.service.GenEntity218Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen218")
public class GenEntity218Controller {
    private final GenEntity218Service service;
    public GenEntity218Controller(GenEntity218Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity218> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity218 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity218 create(@RequestBody GenEntity218 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity218 update(@PathVariable UUID id, @RequestBody GenEntity218 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
