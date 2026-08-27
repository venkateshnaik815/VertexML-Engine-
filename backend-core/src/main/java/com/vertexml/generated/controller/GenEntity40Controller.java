package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity40;
import com.vertexml.generated.service.GenEntity40Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen40")
public class GenEntity40Controller {
    private final GenEntity40Service service;
    public GenEntity40Controller(GenEntity40Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity40> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity40 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity40 create(@RequestBody GenEntity40 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity40 update(@PathVariable UUID id, @RequestBody GenEntity40 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
