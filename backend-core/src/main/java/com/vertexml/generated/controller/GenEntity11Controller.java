package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity11;
import com.vertexml.generated.service.GenEntity11Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen11")
public class GenEntity11Controller {
    private final GenEntity11Service service;
    public GenEntity11Controller(GenEntity11Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity11> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity11 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity11 create(@RequestBody GenEntity11 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity11 update(@PathVariable UUID id, @RequestBody GenEntity11 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
