package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity225;
import com.vertexml.generated.service.GenEntity225Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen225")
public class GenEntity225Controller {
    private final GenEntity225Service service;
    public GenEntity225Controller(GenEntity225Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity225> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity225 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity225 create(@RequestBody GenEntity225 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity225 update(@PathVariable UUID id, @RequestBody GenEntity225 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
