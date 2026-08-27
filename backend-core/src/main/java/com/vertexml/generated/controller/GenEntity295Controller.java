package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity295;
import com.vertexml.generated.service.GenEntity295Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen295")
public class GenEntity295Controller {
    private final GenEntity295Service service;
    public GenEntity295Controller(GenEntity295Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity295> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity295 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity295 create(@RequestBody GenEntity295 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity295 update(@PathVariable UUID id, @RequestBody GenEntity295 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
