package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity126;
import com.vertexml.generated.service.GenEntity126Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen126")
public class GenEntity126Controller {
    private final GenEntity126Service service;
    public GenEntity126Controller(GenEntity126Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity126> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity126 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity126 create(@RequestBody GenEntity126 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity126 update(@PathVariable UUID id, @RequestBody GenEntity126 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
