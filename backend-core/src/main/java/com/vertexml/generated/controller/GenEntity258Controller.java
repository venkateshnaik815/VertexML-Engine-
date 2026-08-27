package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity258;
import com.vertexml.generated.service.GenEntity258Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen258")
public class GenEntity258Controller {
    private final GenEntity258Service service;
    public GenEntity258Controller(GenEntity258Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity258> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity258 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity258 create(@RequestBody GenEntity258 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity258 update(@PathVariable UUID id, @RequestBody GenEntity258 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
