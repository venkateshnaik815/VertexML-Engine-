package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity65;
import com.vertexml.generated.service.GenEntity65Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen65")
public class GenEntity65Controller {
    private final GenEntity65Service service;
    public GenEntity65Controller(GenEntity65Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity65> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity65 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity65 create(@RequestBody GenEntity65 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity65 update(@PathVariable UUID id, @RequestBody GenEntity65 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
