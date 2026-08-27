package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity77;
import com.vertexml.generated.service.GenEntity77Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen77")
public class GenEntity77Controller {
    private final GenEntity77Service service;
    public GenEntity77Controller(GenEntity77Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity77> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity77 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity77 create(@RequestBody GenEntity77 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity77 update(@PathVariable UUID id, @RequestBody GenEntity77 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
