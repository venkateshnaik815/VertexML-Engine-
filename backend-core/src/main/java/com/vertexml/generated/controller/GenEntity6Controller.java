package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity6;
import com.vertexml.generated.service.GenEntity6Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen6")
public class GenEntity6Controller {
    private final GenEntity6Service service;
    public GenEntity6Controller(GenEntity6Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity6> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity6 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity6 create(@RequestBody GenEntity6 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity6 update(@PathVariable UUID id, @RequestBody GenEntity6 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
