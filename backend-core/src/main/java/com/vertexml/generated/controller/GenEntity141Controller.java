package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity141;
import com.vertexml.generated.service.GenEntity141Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen141")
public class GenEntity141Controller {
    private final GenEntity141Service service;
    public GenEntity141Controller(GenEntity141Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity141> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity141 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity141 create(@RequestBody GenEntity141 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity141 update(@PathVariable UUID id, @RequestBody GenEntity141 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
