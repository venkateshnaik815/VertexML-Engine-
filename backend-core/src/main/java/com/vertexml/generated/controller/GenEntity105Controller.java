package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity105;
import com.vertexml.generated.service.GenEntity105Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen105")
public class GenEntity105Controller {
    private final GenEntity105Service service;
    public GenEntity105Controller(GenEntity105Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity105> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity105 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity105 create(@RequestBody GenEntity105 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity105 update(@PathVariable UUID id, @RequestBody GenEntity105 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
