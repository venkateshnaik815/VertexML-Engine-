package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity14;
import com.vertexml.generated.service.GenEntity14Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen14")
public class GenEntity14Controller {
    private final GenEntity14Service service;
    public GenEntity14Controller(GenEntity14Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity14> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity14 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity14 create(@RequestBody GenEntity14 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity14 update(@PathVariable UUID id, @RequestBody GenEntity14 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
