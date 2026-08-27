package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity31;
import com.vertexml.generated.service.GenEntity31Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen31")
public class GenEntity31Controller {
    private final GenEntity31Service service;
    public GenEntity31Controller(GenEntity31Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity31> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity31 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity31 create(@RequestBody GenEntity31 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity31 update(@PathVariable UUID id, @RequestBody GenEntity31 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
