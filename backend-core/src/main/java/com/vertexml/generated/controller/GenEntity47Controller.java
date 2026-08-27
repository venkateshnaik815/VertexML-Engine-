package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity47;
import com.vertexml.generated.service.GenEntity47Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen47")
public class GenEntity47Controller {
    private final GenEntity47Service service;
    public GenEntity47Controller(GenEntity47Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity47> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity47 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity47 create(@RequestBody GenEntity47 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity47 update(@PathVariable UUID id, @RequestBody GenEntity47 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
