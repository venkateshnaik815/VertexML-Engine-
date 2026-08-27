package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity235;
import com.vertexml.generated.service.GenEntity235Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen235")
public class GenEntity235Controller {
    private final GenEntity235Service service;
    public GenEntity235Controller(GenEntity235Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity235> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity235 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity235 create(@RequestBody GenEntity235 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity235 update(@PathVariable UUID id, @RequestBody GenEntity235 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
