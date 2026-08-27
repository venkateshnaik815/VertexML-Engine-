package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity133;
import com.vertexml.generated.service.GenEntity133Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen133")
public class GenEntity133Controller {
    private final GenEntity133Service service;
    public GenEntity133Controller(GenEntity133Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity133> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity133 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity133 create(@RequestBody GenEntity133 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity133 update(@PathVariable UUID id, @RequestBody GenEntity133 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
