package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity109;
import com.vertexml.generated.service.GenEntity109Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen109")
public class GenEntity109Controller {
    private final GenEntity109Service service;
    public GenEntity109Controller(GenEntity109Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity109> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity109 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity109 create(@RequestBody GenEntity109 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity109 update(@PathVariable UUID id, @RequestBody GenEntity109 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
