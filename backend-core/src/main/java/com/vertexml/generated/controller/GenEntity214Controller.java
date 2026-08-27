package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity214;
import com.vertexml.generated.service.GenEntity214Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen214")
public class GenEntity214Controller {
    private final GenEntity214Service service;
    public GenEntity214Controller(GenEntity214Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity214> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity214 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity214 create(@RequestBody GenEntity214 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity214 update(@PathVariable UUID id, @RequestBody GenEntity214 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
