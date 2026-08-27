package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity34;
import com.vertexml.generated.service.GenEntity34Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen34")
public class GenEntity34Controller {
    private final GenEntity34Service service;
    public GenEntity34Controller(GenEntity34Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity34> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity34 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity34 create(@RequestBody GenEntity34 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity34 update(@PathVariable UUID id, @RequestBody GenEntity34 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
