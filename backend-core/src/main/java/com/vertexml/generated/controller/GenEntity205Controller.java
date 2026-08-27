package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity205;
import com.vertexml.generated.service.GenEntity205Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen205")
public class GenEntity205Controller {
    private final GenEntity205Service service;
    public GenEntity205Controller(GenEntity205Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity205> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity205 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity205 create(@RequestBody GenEntity205 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity205 update(@PathVariable UUID id, @RequestBody GenEntity205 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
