package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity86;
import com.vertexml.generated.service.GenEntity86Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen86")
public class GenEntity86Controller {
    private final GenEntity86Service service;
    public GenEntity86Controller(GenEntity86Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity86> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity86 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity86 create(@RequestBody GenEntity86 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity86 update(@PathVariable UUID id, @RequestBody GenEntity86 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
