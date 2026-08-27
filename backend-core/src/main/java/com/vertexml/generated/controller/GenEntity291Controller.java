package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity291;
import com.vertexml.generated.service.GenEntity291Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen291")
public class GenEntity291Controller {
    private final GenEntity291Service service;
    public GenEntity291Controller(GenEntity291Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity291> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity291 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity291 create(@RequestBody GenEntity291 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity291 update(@PathVariable UUID id, @RequestBody GenEntity291 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
