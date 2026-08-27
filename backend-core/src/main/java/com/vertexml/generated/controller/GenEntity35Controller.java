package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity35;
import com.vertexml.generated.service.GenEntity35Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen35")
public class GenEntity35Controller {
    private final GenEntity35Service service;
    public GenEntity35Controller(GenEntity35Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity35> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity35 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity35 create(@RequestBody GenEntity35 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity35 update(@PathVariable UUID id, @RequestBody GenEntity35 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
