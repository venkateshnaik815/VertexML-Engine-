package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity63;
import com.vertexml.generated.service.GenEntity63Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen63")
public class GenEntity63Controller {
    private final GenEntity63Service service;
    public GenEntity63Controller(GenEntity63Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity63> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity63 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity63 create(@RequestBody GenEntity63 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity63 update(@PathVariable UUID id, @RequestBody GenEntity63 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
