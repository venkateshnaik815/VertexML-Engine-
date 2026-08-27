package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity267;
import com.vertexml.generated.service.GenEntity267Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen267")
public class GenEntity267Controller {
    private final GenEntity267Service service;
    public GenEntity267Controller(GenEntity267Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity267> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity267 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity267 create(@RequestBody GenEntity267 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity267 update(@PathVariable UUID id, @RequestBody GenEntity267 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
