package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity170;
import com.vertexml.generated.service.GenEntity170Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen170")
public class GenEntity170Controller {
    private final GenEntity170Service service;
    public GenEntity170Controller(GenEntity170Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity170> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity170 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity170 create(@RequestBody GenEntity170 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity170 update(@PathVariable UUID id, @RequestBody GenEntity170 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
