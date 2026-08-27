package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity197;
import com.vertexml.generated.service.GenEntity197Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen197")
public class GenEntity197Controller {
    private final GenEntity197Service service;
    public GenEntity197Controller(GenEntity197Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity197> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity197 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity197 create(@RequestBody GenEntity197 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity197 update(@PathVariable UUID id, @RequestBody GenEntity197 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
