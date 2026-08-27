package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity121;
import com.vertexml.generated.service.GenEntity121Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen121")
public class GenEntity121Controller {
    private final GenEntity121Service service;
    public GenEntity121Controller(GenEntity121Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity121> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity121 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity121 create(@RequestBody GenEntity121 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity121 update(@PathVariable UUID id, @RequestBody GenEntity121 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
