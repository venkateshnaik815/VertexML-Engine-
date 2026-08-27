package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity238;
import com.vertexml.generated.service.GenEntity238Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen238")
public class GenEntity238Controller {
    private final GenEntity238Service service;
    public GenEntity238Controller(GenEntity238Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity238> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity238 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity238 create(@RequestBody GenEntity238 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity238 update(@PathVariable UUID id, @RequestBody GenEntity238 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
