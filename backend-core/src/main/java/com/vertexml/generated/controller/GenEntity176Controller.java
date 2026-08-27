package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity176;
import com.vertexml.generated.service.GenEntity176Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen176")
public class GenEntity176Controller {
    private final GenEntity176Service service;
    public GenEntity176Controller(GenEntity176Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity176> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity176 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity176 create(@RequestBody GenEntity176 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity176 update(@PathVariable UUID id, @RequestBody GenEntity176 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
