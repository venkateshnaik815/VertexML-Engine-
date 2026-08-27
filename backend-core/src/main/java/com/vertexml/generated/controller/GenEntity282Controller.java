package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity282;
import com.vertexml.generated.service.GenEntity282Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen282")
public class GenEntity282Controller {
    private final GenEntity282Service service;
    public GenEntity282Controller(GenEntity282Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity282> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity282 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity282 create(@RequestBody GenEntity282 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity282 update(@PathVariable UUID id, @RequestBody GenEntity282 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
