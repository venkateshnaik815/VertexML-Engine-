package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity122;
import com.vertexml.generated.service.GenEntity122Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen122")
public class GenEntity122Controller {
    private final GenEntity122Service service;
    public GenEntity122Controller(GenEntity122Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity122> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity122 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity122 create(@RequestBody GenEntity122 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity122 update(@PathVariable UUID id, @RequestBody GenEntity122 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
