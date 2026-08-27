package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity112;
import com.vertexml.generated.service.GenEntity112Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen112")
public class GenEntity112Controller {
    private final GenEntity112Service service;
    public GenEntity112Controller(GenEntity112Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity112> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity112 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity112 create(@RequestBody GenEntity112 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity112 update(@PathVariable UUID id, @RequestBody GenEntity112 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
