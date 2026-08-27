package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity119;
import com.vertexml.generated.service.GenEntity119Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen119")
public class GenEntity119Controller {
    private final GenEntity119Service service;
    public GenEntity119Controller(GenEntity119Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity119> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity119 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity119 create(@RequestBody GenEntity119 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity119 update(@PathVariable UUID id, @RequestBody GenEntity119 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
