package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity208;
import com.vertexml.generated.service.GenEntity208Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen208")
public class GenEntity208Controller {
    private final GenEntity208Service service;
    public GenEntity208Controller(GenEntity208Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity208> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity208 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity208 create(@RequestBody GenEntity208 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity208 update(@PathVariable UUID id, @RequestBody GenEntity208 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
