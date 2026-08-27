package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity233;
import com.vertexml.generated.service.GenEntity233Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen233")
public class GenEntity233Controller {
    private final GenEntity233Service service;
    public GenEntity233Controller(GenEntity233Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity233> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity233 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity233 create(@RequestBody GenEntity233 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity233 update(@PathVariable UUID id, @RequestBody GenEntity233 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
