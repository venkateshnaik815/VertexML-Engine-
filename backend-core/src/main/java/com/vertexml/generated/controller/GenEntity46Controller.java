package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity46;
import com.vertexml.generated.service.GenEntity46Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen46")
public class GenEntity46Controller {
    private final GenEntity46Service service;
    public GenEntity46Controller(GenEntity46Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity46> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity46 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity46 create(@RequestBody GenEntity46 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity46 update(@PathVariable UUID id, @RequestBody GenEntity46 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
