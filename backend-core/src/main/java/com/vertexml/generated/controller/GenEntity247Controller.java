package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity247;
import com.vertexml.generated.service.GenEntity247Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen247")
public class GenEntity247Controller {
    private final GenEntity247Service service;
    public GenEntity247Controller(GenEntity247Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity247> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity247 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity247 create(@RequestBody GenEntity247 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity247 update(@PathVariable UUID id, @RequestBody GenEntity247 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
