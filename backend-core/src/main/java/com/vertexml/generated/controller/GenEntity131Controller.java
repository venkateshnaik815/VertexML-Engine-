package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity131;
import com.vertexml.generated.service.GenEntity131Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen131")
public class GenEntity131Controller {
    private final GenEntity131Service service;
    public GenEntity131Controller(GenEntity131Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity131> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity131 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity131 create(@RequestBody GenEntity131 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity131 update(@PathVariable UUID id, @RequestBody GenEntity131 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
