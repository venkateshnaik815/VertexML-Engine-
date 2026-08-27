package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity156;
import com.vertexml.generated.service.GenEntity156Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen156")
public class GenEntity156Controller {
    private final GenEntity156Service service;
    public GenEntity156Controller(GenEntity156Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity156> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity156 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity156 create(@RequestBody GenEntity156 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity156 update(@PathVariable UUID id, @RequestBody GenEntity156 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
