package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity127;
import com.vertexml.generated.service.GenEntity127Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen127")
public class GenEntity127Controller {
    private final GenEntity127Service service;
    public GenEntity127Controller(GenEntity127Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity127> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity127 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity127 create(@RequestBody GenEntity127 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity127 update(@PathVariable UUID id, @RequestBody GenEntity127 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
