package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity64;
import com.vertexml.generated.service.GenEntity64Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen64")
public class GenEntity64Controller {
    private final GenEntity64Service service;
    public GenEntity64Controller(GenEntity64Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity64> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity64 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity64 create(@RequestBody GenEntity64 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity64 update(@PathVariable UUID id, @RequestBody GenEntity64 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
