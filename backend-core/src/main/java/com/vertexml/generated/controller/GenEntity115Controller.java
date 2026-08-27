package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity115;
import com.vertexml.generated.service.GenEntity115Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen115")
public class GenEntity115Controller {
    private final GenEntity115Service service;
    public GenEntity115Controller(GenEntity115Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity115> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity115 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity115 create(@RequestBody GenEntity115 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity115 update(@PathVariable UUID id, @RequestBody GenEntity115 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
