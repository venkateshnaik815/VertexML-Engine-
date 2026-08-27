package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity66;
import com.vertexml.generated.service.GenEntity66Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen66")
public class GenEntity66Controller {
    private final GenEntity66Service service;
    public GenEntity66Controller(GenEntity66Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity66> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity66 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity66 create(@RequestBody GenEntity66 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity66 update(@PathVariable UUID id, @RequestBody GenEntity66 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
