package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity54;
import com.vertexml.generated.service.GenEntity54Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen54")
public class GenEntity54Controller {
    private final GenEntity54Service service;
    public GenEntity54Controller(GenEntity54Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity54> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity54 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity54 create(@RequestBody GenEntity54 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity54 update(@PathVariable UUID id, @RequestBody GenEntity54 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
