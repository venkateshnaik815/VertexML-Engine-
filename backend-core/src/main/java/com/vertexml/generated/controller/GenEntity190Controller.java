package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity190;
import com.vertexml.generated.service.GenEntity190Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen190")
public class GenEntity190Controller {
    private final GenEntity190Service service;
    public GenEntity190Controller(GenEntity190Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity190> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity190 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity190 create(@RequestBody GenEntity190 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity190 update(@PathVariable UUID id, @RequestBody GenEntity190 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
