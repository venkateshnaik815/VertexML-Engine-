package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity169;
import com.vertexml.generated.service.GenEntity169Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen169")
public class GenEntity169Controller {
    private final GenEntity169Service service;
    public GenEntity169Controller(GenEntity169Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity169> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity169 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity169 create(@RequestBody GenEntity169 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity169 update(@PathVariable UUID id, @RequestBody GenEntity169 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
