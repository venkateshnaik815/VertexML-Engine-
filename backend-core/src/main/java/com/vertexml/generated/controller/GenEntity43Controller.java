package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity43;
import com.vertexml.generated.service.GenEntity43Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen43")
public class GenEntity43Controller {
    private final GenEntity43Service service;
    public GenEntity43Controller(GenEntity43Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity43> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity43 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity43 create(@RequestBody GenEntity43 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity43 update(@PathVariable UUID id, @RequestBody GenEntity43 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
