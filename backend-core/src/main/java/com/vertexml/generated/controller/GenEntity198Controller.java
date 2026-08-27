package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity198;
import com.vertexml.generated.service.GenEntity198Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen198")
public class GenEntity198Controller {
    private final GenEntity198Service service;
    public GenEntity198Controller(GenEntity198Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity198> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity198 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity198 create(@RequestBody GenEntity198 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity198 update(@PathVariable UUID id, @RequestBody GenEntity198 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
