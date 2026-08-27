package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity242;
import com.vertexml.generated.service.GenEntity242Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen242")
public class GenEntity242Controller {
    private final GenEntity242Service service;
    public GenEntity242Controller(GenEntity242Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity242> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity242 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity242 create(@RequestBody GenEntity242 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity242 update(@PathVariable UUID id, @RequestBody GenEntity242 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
