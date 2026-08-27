package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity182;
import com.vertexml.generated.service.GenEntity182Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen182")
public class GenEntity182Controller {
    private final GenEntity182Service service;
    public GenEntity182Controller(GenEntity182Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity182> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity182 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity182 create(@RequestBody GenEntity182 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity182 update(@PathVariable UUID id, @RequestBody GenEntity182 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
