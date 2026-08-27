package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity193;
import com.vertexml.generated.service.GenEntity193Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen193")
public class GenEntity193Controller {
    private final GenEntity193Service service;
    public GenEntity193Controller(GenEntity193Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity193> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity193 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity193 create(@RequestBody GenEntity193 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity193 update(@PathVariable UUID id, @RequestBody GenEntity193 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
