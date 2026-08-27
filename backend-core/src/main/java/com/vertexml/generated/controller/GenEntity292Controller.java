package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity292;
import com.vertexml.generated.service.GenEntity292Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen292")
public class GenEntity292Controller {
    private final GenEntity292Service service;
    public GenEntity292Controller(GenEntity292Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity292> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity292 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity292 create(@RequestBody GenEntity292 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity292 update(@PathVariable UUID id, @RequestBody GenEntity292 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
