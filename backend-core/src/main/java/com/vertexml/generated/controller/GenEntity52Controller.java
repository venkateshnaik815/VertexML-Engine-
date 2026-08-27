package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity52;
import com.vertexml.generated.service.GenEntity52Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen52")
public class GenEntity52Controller {
    private final GenEntity52Service service;
    public GenEntity52Controller(GenEntity52Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity52> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity52 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity52 create(@RequestBody GenEntity52 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity52 update(@PathVariable UUID id, @RequestBody GenEntity52 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
