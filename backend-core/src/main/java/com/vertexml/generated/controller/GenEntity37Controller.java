package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity37;
import com.vertexml.generated.service.GenEntity37Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen37")
public class GenEntity37Controller {
    private final GenEntity37Service service;
    public GenEntity37Controller(GenEntity37Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity37> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity37 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity37 create(@RequestBody GenEntity37 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity37 update(@PathVariable UUID id, @RequestBody GenEntity37 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
