package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity13;
import com.vertexml.generated.service.GenEntity13Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen13")
public class GenEntity13Controller {
    private final GenEntity13Service service;
    public GenEntity13Controller(GenEntity13Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity13> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity13 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity13 create(@RequestBody GenEntity13 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity13 update(@PathVariable UUID id, @RequestBody GenEntity13 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
