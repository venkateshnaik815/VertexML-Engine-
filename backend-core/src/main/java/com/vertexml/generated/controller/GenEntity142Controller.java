package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity142;
import com.vertexml.generated.service.GenEntity142Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen142")
public class GenEntity142Controller {
    private final GenEntity142Service service;
    public GenEntity142Controller(GenEntity142Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity142> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity142 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity142 create(@RequestBody GenEntity142 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity142 update(@PathVariable UUID id, @RequestBody GenEntity142 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
