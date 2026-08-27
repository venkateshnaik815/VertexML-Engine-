package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity196;
import com.vertexml.generated.service.GenEntity196Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen196")
public class GenEntity196Controller {
    private final GenEntity196Service service;
    public GenEntity196Controller(GenEntity196Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity196> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity196 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity196 create(@RequestBody GenEntity196 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity196 update(@PathVariable UUID id, @RequestBody GenEntity196 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
