package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity24;
import com.vertexml.generated.service.GenEntity24Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen24")
public class GenEntity24Controller {
    private final GenEntity24Service service;
    public GenEntity24Controller(GenEntity24Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity24> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity24 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity24 create(@RequestBody GenEntity24 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity24 update(@PathVariable UUID id, @RequestBody GenEntity24 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
