package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity228;
import com.vertexml.generated.service.GenEntity228Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen228")
public class GenEntity228Controller {
    private final GenEntity228Service service;
    public GenEntity228Controller(GenEntity228Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity228> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity228 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity228 create(@RequestBody GenEntity228 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity228 update(@PathVariable UUID id, @RequestBody GenEntity228 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
