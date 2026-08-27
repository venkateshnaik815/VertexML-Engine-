package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity67;
import com.vertexml.generated.service.GenEntity67Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen67")
public class GenEntity67Controller {
    private final GenEntity67Service service;
    public GenEntity67Controller(GenEntity67Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity67> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity67 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity67 create(@RequestBody GenEntity67 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity67 update(@PathVariable UUID id, @RequestBody GenEntity67 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
