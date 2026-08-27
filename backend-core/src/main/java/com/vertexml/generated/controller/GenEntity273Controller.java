package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity273;
import com.vertexml.generated.service.GenEntity273Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen273")
public class GenEntity273Controller {
    private final GenEntity273Service service;
    public GenEntity273Controller(GenEntity273Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity273> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity273 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity273 create(@RequestBody GenEntity273 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity273 update(@PathVariable UUID id, @RequestBody GenEntity273 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
