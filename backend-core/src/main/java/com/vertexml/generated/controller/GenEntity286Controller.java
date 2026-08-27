package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity286;
import com.vertexml.generated.service.GenEntity286Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen286")
public class GenEntity286Controller {
    private final GenEntity286Service service;
    public GenEntity286Controller(GenEntity286Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity286> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity286 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity286 create(@RequestBody GenEntity286 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity286 update(@PathVariable UUID id, @RequestBody GenEntity286 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
