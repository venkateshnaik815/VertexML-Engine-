package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity89;
import com.vertexml.generated.service.GenEntity89Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen89")
public class GenEntity89Controller {
    private final GenEntity89Service service;
    public GenEntity89Controller(GenEntity89Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity89> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity89 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity89 create(@RequestBody GenEntity89 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity89 update(@PathVariable UUID id, @RequestBody GenEntity89 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
