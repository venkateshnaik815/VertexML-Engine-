package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity210;
import com.vertexml.generated.service.GenEntity210Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen210")
public class GenEntity210Controller {
    private final GenEntity210Service service;
    public GenEntity210Controller(GenEntity210Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity210> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity210 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity210 create(@RequestBody GenEntity210 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity210 update(@PathVariable UUID id, @RequestBody GenEntity210 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
