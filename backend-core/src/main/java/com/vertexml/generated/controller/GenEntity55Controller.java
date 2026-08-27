package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity55;
import com.vertexml.generated.service.GenEntity55Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen55")
public class GenEntity55Controller {
    private final GenEntity55Service service;
    public GenEntity55Controller(GenEntity55Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity55> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity55 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity55 create(@RequestBody GenEntity55 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity55 update(@PathVariable UUID id, @RequestBody GenEntity55 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
