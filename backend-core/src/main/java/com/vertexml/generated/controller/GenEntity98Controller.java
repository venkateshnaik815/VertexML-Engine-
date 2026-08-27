package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity98;
import com.vertexml.generated.service.GenEntity98Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen98")
public class GenEntity98Controller {
    private final GenEntity98Service service;
    public GenEntity98Controller(GenEntity98Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity98> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity98 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity98 create(@RequestBody GenEntity98 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity98 update(@PathVariable UUID id, @RequestBody GenEntity98 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
