package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity10;
import com.vertexml.generated.service.GenEntity10Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen10")
public class GenEntity10Controller {
    private final GenEntity10Service service;
    public GenEntity10Controller(GenEntity10Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity10> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity10 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity10 create(@RequestBody GenEntity10 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity10 update(@PathVariable UUID id, @RequestBody GenEntity10 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
