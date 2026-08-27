package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity285;
import com.vertexml.generated.service.GenEntity285Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen285")
public class GenEntity285Controller {
    private final GenEntity285Service service;
    public GenEntity285Controller(GenEntity285Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity285> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity285 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity285 create(@RequestBody GenEntity285 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity285 update(@PathVariable UUID id, @RequestBody GenEntity285 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
