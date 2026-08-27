package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity12;
import com.vertexml.generated.service.GenEntity12Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen12")
public class GenEntity12Controller {
    private final GenEntity12Service service;
    public GenEntity12Controller(GenEntity12Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity12> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity12 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity12 create(@RequestBody GenEntity12 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity12 update(@PathVariable UUID id, @RequestBody GenEntity12 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
