package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity81;
import com.vertexml.generated.service.GenEntity81Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen81")
public class GenEntity81Controller {
    private final GenEntity81Service service;
    public GenEntity81Controller(GenEntity81Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity81> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity81 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity81 create(@RequestBody GenEntity81 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity81 update(@PathVariable UUID id, @RequestBody GenEntity81 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
