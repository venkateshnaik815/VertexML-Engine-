package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity209;
import com.vertexml.generated.service.GenEntity209Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen209")
public class GenEntity209Controller {
    private final GenEntity209Service service;
    public GenEntity209Controller(GenEntity209Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity209> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity209 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity209 create(@RequestBody GenEntity209 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity209 update(@PathVariable UUID id, @RequestBody GenEntity209 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
