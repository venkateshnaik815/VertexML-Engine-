package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity189;
import com.vertexml.generated.service.GenEntity189Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen189")
public class GenEntity189Controller {
    private final GenEntity189Service service;
    public GenEntity189Controller(GenEntity189Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity189> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity189 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity189 create(@RequestBody GenEntity189 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity189 update(@PathVariable UUID id, @RequestBody GenEntity189 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
