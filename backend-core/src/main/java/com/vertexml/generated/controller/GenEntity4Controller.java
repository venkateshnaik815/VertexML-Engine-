package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity4;
import com.vertexml.generated.service.GenEntity4Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen4")
public class GenEntity4Controller {
    private final GenEntity4Service service;
    public GenEntity4Controller(GenEntity4Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity4> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity4 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity4 create(@RequestBody GenEntity4 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity4 update(@PathVariable UUID id, @RequestBody GenEntity4 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
