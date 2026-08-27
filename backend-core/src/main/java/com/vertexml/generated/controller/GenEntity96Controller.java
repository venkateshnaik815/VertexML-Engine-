package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity96;
import com.vertexml.generated.service.GenEntity96Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen96")
public class GenEntity96Controller {
    private final GenEntity96Service service;
    public GenEntity96Controller(GenEntity96Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity96> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity96 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity96 create(@RequestBody GenEntity96 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity96 update(@PathVariable UUID id, @RequestBody GenEntity96 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
