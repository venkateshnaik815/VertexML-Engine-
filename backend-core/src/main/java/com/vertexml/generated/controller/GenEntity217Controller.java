package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity217;
import com.vertexml.generated.service.GenEntity217Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen217")
public class GenEntity217Controller {
    private final GenEntity217Service service;
    public GenEntity217Controller(GenEntity217Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity217> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity217 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity217 create(@RequestBody GenEntity217 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity217 update(@PathVariable UUID id, @RequestBody GenEntity217 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
