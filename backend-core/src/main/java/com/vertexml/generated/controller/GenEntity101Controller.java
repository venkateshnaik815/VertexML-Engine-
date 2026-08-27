package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity101;
import com.vertexml.generated.service.GenEntity101Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen101")
public class GenEntity101Controller {
    private final GenEntity101Service service;
    public GenEntity101Controller(GenEntity101Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity101> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity101 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity101 create(@RequestBody GenEntity101 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity101 update(@PathVariable UUID id, @RequestBody GenEntity101 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
