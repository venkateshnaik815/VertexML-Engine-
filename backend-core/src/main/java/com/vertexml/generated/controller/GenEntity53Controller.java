package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity53;
import com.vertexml.generated.service.GenEntity53Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen53")
public class GenEntity53Controller {
    private final GenEntity53Service service;
    public GenEntity53Controller(GenEntity53Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity53> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity53 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity53 create(@RequestBody GenEntity53 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity53 update(@PathVariable UUID id, @RequestBody GenEntity53 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
