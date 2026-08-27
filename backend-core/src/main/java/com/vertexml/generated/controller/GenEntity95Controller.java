package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity95;
import com.vertexml.generated.service.GenEntity95Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen95")
public class GenEntity95Controller {
    private final GenEntity95Service service;
    public GenEntity95Controller(GenEntity95Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity95> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity95 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity95 create(@RequestBody GenEntity95 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity95 update(@PathVariable UUID id, @RequestBody GenEntity95 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
