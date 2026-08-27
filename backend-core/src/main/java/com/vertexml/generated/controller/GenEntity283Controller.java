package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity283;
import com.vertexml.generated.service.GenEntity283Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen283")
public class GenEntity283Controller {
    private final GenEntity283Service service;
    public GenEntity283Controller(GenEntity283Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity283> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity283 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity283 create(@RequestBody GenEntity283 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity283 update(@PathVariable UUID id, @RequestBody GenEntity283 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
