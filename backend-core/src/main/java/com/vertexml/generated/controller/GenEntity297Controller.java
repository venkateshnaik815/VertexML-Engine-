package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity297;
import com.vertexml.generated.service.GenEntity297Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen297")
public class GenEntity297Controller {
    private final GenEntity297Service service;
    public GenEntity297Controller(GenEntity297Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity297> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity297 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity297 create(@RequestBody GenEntity297 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity297 update(@PathVariable UUID id, @RequestBody GenEntity297 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
