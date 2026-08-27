package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity73;
import com.vertexml.generated.service.GenEntity73Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen73")
public class GenEntity73Controller {
    private final GenEntity73Service service;
    public GenEntity73Controller(GenEntity73Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity73> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity73 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity73 create(@RequestBody GenEntity73 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity73 update(@PathVariable UUID id, @RequestBody GenEntity73 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
