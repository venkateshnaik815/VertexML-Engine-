package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity57;
import com.vertexml.generated.service.GenEntity57Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen57")
public class GenEntity57Controller {
    private final GenEntity57Service service;
    public GenEntity57Controller(GenEntity57Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity57> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity57 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity57 create(@RequestBody GenEntity57 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity57 update(@PathVariable UUID id, @RequestBody GenEntity57 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
