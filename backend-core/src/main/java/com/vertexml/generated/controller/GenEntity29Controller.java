package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity29;
import com.vertexml.generated.service.GenEntity29Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen29")
public class GenEntity29Controller {
    private final GenEntity29Service service;
    public GenEntity29Controller(GenEntity29Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity29> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity29 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity29 create(@RequestBody GenEntity29 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity29 update(@PathVariable UUID id, @RequestBody GenEntity29 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
