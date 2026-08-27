package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity147;
import com.vertexml.generated.service.GenEntity147Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen147")
public class GenEntity147Controller {
    private final GenEntity147Service service;
    public GenEntity147Controller(GenEntity147Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity147> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity147 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity147 create(@RequestBody GenEntity147 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity147 update(@PathVariable UUID id, @RequestBody GenEntity147 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
