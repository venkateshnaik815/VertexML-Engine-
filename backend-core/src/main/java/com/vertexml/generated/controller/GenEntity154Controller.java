package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity154;
import com.vertexml.generated.service.GenEntity154Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen154")
public class GenEntity154Controller {
    private final GenEntity154Service service;
    public GenEntity154Controller(GenEntity154Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity154> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity154 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity154 create(@RequestBody GenEntity154 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity154 update(@PathVariable UUID id, @RequestBody GenEntity154 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
