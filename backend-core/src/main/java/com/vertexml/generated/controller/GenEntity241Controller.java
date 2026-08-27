package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity241;
import com.vertexml.generated.service.GenEntity241Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen241")
public class GenEntity241Controller {
    private final GenEntity241Service service;
    public GenEntity241Controller(GenEntity241Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity241> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity241 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity241 create(@RequestBody GenEntity241 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity241 update(@PathVariable UUID id, @RequestBody GenEntity241 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
