package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity136;
import com.vertexml.generated.service.GenEntity136Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen136")
public class GenEntity136Controller {
    private final GenEntity136Service service;
    public GenEntity136Controller(GenEntity136Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity136> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity136 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity136 create(@RequestBody GenEntity136 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity136 update(@PathVariable UUID id, @RequestBody GenEntity136 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
