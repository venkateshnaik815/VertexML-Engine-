package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity163;
import com.vertexml.generated.service.GenEntity163Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen163")
public class GenEntity163Controller {
    private final GenEntity163Service service;
    public GenEntity163Controller(GenEntity163Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity163> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity163 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity163 create(@RequestBody GenEntity163 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity163 update(@PathVariable UUID id, @RequestBody GenEntity163 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
