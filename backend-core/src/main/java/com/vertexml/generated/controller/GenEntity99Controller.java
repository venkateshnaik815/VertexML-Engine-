package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity99;
import com.vertexml.generated.service.GenEntity99Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen99")
public class GenEntity99Controller {
    private final GenEntity99Service service;
    public GenEntity99Controller(GenEntity99Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity99> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity99 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity99 create(@RequestBody GenEntity99 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity99 update(@PathVariable UUID id, @RequestBody GenEntity99 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
