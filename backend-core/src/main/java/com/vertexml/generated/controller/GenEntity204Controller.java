package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity204;
import com.vertexml.generated.service.GenEntity204Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen204")
public class GenEntity204Controller {
    private final GenEntity204Service service;
    public GenEntity204Controller(GenEntity204Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity204> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity204 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity204 create(@RequestBody GenEntity204 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity204 update(@PathVariable UUID id, @RequestBody GenEntity204 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
