package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity212;
import com.vertexml.generated.service.GenEntity212Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen212")
public class GenEntity212Controller {
    private final GenEntity212Service service;
    public GenEntity212Controller(GenEntity212Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity212> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity212 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity212 create(@RequestBody GenEntity212 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity212 update(@PathVariable UUID id, @RequestBody GenEntity212 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
