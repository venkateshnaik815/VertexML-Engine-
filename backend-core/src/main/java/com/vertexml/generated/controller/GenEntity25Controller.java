package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity25;
import com.vertexml.generated.service.GenEntity25Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen25")
public class GenEntity25Controller {
    private final GenEntity25Service service;
    public GenEntity25Controller(GenEntity25Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity25> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity25 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity25 create(@RequestBody GenEntity25 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity25 update(@PathVariable UUID id, @RequestBody GenEntity25 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
