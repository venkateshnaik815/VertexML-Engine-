package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity191;
import com.vertexml.generated.service.GenEntity191Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen191")
public class GenEntity191Controller {
    private final GenEntity191Service service;
    public GenEntity191Controller(GenEntity191Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity191> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity191 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity191 create(@RequestBody GenEntity191 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity191 update(@PathVariable UUID id, @RequestBody GenEntity191 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
