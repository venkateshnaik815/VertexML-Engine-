package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity223;
import com.vertexml.generated.service.GenEntity223Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen223")
public class GenEntity223Controller {
    private final GenEntity223Service service;
    public GenEntity223Controller(GenEntity223Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity223> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity223 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity223 create(@RequestBody GenEntity223 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity223 update(@PathVariable UUID id, @RequestBody GenEntity223 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
