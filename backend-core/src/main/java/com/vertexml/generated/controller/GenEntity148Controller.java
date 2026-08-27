package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity148;
import com.vertexml.generated.service.GenEntity148Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen148")
public class GenEntity148Controller {
    private final GenEntity148Service service;
    public GenEntity148Controller(GenEntity148Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity148> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity148 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity148 create(@RequestBody GenEntity148 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity148 update(@PathVariable UUID id, @RequestBody GenEntity148 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
