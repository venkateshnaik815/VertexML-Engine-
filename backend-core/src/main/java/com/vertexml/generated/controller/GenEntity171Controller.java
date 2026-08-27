package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity171;
import com.vertexml.generated.service.GenEntity171Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen171")
public class GenEntity171Controller {
    private final GenEntity171Service service;
    public GenEntity171Controller(GenEntity171Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity171> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity171 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity171 create(@RequestBody GenEntity171 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity171 update(@PathVariable UUID id, @RequestBody GenEntity171 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
