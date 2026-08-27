package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity134;
import com.vertexml.generated.service.GenEntity134Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen134")
public class GenEntity134Controller {
    private final GenEntity134Service service;
    public GenEntity134Controller(GenEntity134Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity134> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity134 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity134 create(@RequestBody GenEntity134 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity134 update(@PathVariable UUID id, @RequestBody GenEntity134 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
