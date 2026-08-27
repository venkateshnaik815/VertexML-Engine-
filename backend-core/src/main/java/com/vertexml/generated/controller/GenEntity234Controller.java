package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity234;
import com.vertexml.generated.service.GenEntity234Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen234")
public class GenEntity234Controller {
    private final GenEntity234Service service;
    public GenEntity234Controller(GenEntity234Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity234> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity234 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity234 create(@RequestBody GenEntity234 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity234 update(@PathVariable UUID id, @RequestBody GenEntity234 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
