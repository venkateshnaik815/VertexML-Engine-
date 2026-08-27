package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity17;
import com.vertexml.generated.service.GenEntity17Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen17")
public class GenEntity17Controller {
    private final GenEntity17Service service;
    public GenEntity17Controller(GenEntity17Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity17> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity17 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity17 create(@RequestBody GenEntity17 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity17 update(@PathVariable UUID id, @RequestBody GenEntity17 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
