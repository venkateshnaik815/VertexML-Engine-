package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity215;
import com.vertexml.generated.service.GenEntity215Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen215")
public class GenEntity215Controller {
    private final GenEntity215Service service;
    public GenEntity215Controller(GenEntity215Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity215> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity215 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity215 create(@RequestBody GenEntity215 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity215 update(@PathVariable UUID id, @RequestBody GenEntity215 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
