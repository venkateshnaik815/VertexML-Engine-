package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity153;
import com.vertexml.generated.service.GenEntity153Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen153")
public class GenEntity153Controller {
    private final GenEntity153Service service;
    public GenEntity153Controller(GenEntity153Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity153> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity153 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity153 create(@RequestBody GenEntity153 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity153 update(@PathVariable UUID id, @RequestBody GenEntity153 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
