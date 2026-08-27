package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity243;
import com.vertexml.generated.service.GenEntity243Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen243")
public class GenEntity243Controller {
    private final GenEntity243Service service;
    public GenEntity243Controller(GenEntity243Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity243> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity243 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity243 create(@RequestBody GenEntity243 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity243 update(@PathVariable UUID id, @RequestBody GenEntity243 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
