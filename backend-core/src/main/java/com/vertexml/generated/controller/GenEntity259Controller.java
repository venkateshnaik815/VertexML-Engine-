package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity259;
import com.vertexml.generated.service.GenEntity259Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen259")
public class GenEntity259Controller {
    private final GenEntity259Service service;
    public GenEntity259Controller(GenEntity259Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity259> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity259 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity259 create(@RequestBody GenEntity259 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity259 update(@PathVariable UUID id, @RequestBody GenEntity259 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
