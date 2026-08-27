package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity135;
import com.vertexml.generated.service.GenEntity135Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen135")
public class GenEntity135Controller {
    private final GenEntity135Service service;
    public GenEntity135Controller(GenEntity135Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity135> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity135 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity135 create(@RequestBody GenEntity135 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity135 update(@PathVariable UUID id, @RequestBody GenEntity135 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
