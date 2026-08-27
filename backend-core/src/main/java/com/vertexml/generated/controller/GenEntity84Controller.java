package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity84;
import com.vertexml.generated.service.GenEntity84Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen84")
public class GenEntity84Controller {
    private final GenEntity84Service service;
    public GenEntity84Controller(GenEntity84Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity84> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity84 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity84 create(@RequestBody GenEntity84 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity84 update(@PathVariable UUID id, @RequestBody GenEntity84 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
