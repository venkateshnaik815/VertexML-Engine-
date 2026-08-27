package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity253;
import com.vertexml.generated.service.GenEntity253Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen253")
public class GenEntity253Controller {
    private final GenEntity253Service service;
    public GenEntity253Controller(GenEntity253Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity253> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity253 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity253 create(@RequestBody GenEntity253 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity253 update(@PathVariable UUID id, @RequestBody GenEntity253 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
