package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity194;
import com.vertexml.generated.service.GenEntity194Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen194")
public class GenEntity194Controller {
    private final GenEntity194Service service;
    public GenEntity194Controller(GenEntity194Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity194> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity194 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity194 create(@RequestBody GenEntity194 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity194 update(@PathVariable UUID id, @RequestBody GenEntity194 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
