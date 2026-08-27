package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity79;
import com.vertexml.generated.service.GenEntity79Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen79")
public class GenEntity79Controller {
    private final GenEntity79Service service;
    public GenEntity79Controller(GenEntity79Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity79> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity79 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity79 create(@RequestBody GenEntity79 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity79 update(@PathVariable UUID id, @RequestBody GenEntity79 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
