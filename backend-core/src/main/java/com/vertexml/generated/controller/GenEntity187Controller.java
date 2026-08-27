package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity187;
import com.vertexml.generated.service.GenEntity187Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen187")
public class GenEntity187Controller {
    private final GenEntity187Service service;
    public GenEntity187Controller(GenEntity187Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity187> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity187 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity187 create(@RequestBody GenEntity187 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity187 update(@PathVariable UUID id, @RequestBody GenEntity187 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
