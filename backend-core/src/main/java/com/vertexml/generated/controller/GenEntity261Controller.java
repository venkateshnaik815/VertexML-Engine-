package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity261;
import com.vertexml.generated.service.GenEntity261Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen261")
public class GenEntity261Controller {
    private final GenEntity261Service service;
    public GenEntity261Controller(GenEntity261Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity261> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity261 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity261 create(@RequestBody GenEntity261 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity261 update(@PathVariable UUID id, @RequestBody GenEntity261 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
