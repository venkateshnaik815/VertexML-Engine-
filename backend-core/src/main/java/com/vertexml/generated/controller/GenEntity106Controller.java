package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity106;
import com.vertexml.generated.service.GenEntity106Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen106")
public class GenEntity106Controller {
    private final GenEntity106Service service;
    public GenEntity106Controller(GenEntity106Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity106> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity106 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity106 create(@RequestBody GenEntity106 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity106 update(@PathVariable UUID id, @RequestBody GenEntity106 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
