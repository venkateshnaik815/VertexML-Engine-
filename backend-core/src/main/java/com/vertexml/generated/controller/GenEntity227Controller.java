package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity227;
import com.vertexml.generated.service.GenEntity227Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen227")
public class GenEntity227Controller {
    private final GenEntity227Service service;
    public GenEntity227Controller(GenEntity227Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity227> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity227 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity227 create(@RequestBody GenEntity227 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity227 update(@PathVariable UUID id, @RequestBody GenEntity227 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
