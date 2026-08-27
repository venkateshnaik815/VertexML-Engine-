package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity185;
import com.vertexml.generated.service.GenEntity185Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen185")
public class GenEntity185Controller {
    private final GenEntity185Service service;
    public GenEntity185Controller(GenEntity185Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity185> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity185 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity185 create(@RequestBody GenEntity185 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity185 update(@PathVariable UUID id, @RequestBody GenEntity185 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
