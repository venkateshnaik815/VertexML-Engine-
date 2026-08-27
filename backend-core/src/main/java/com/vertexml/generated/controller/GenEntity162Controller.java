package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity162;
import com.vertexml.generated.service.GenEntity162Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen162")
public class GenEntity162Controller {
    private final GenEntity162Service service;
    public GenEntity162Controller(GenEntity162Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity162> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity162 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity162 create(@RequestBody GenEntity162 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity162 update(@PathVariable UUID id, @RequestBody GenEntity162 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
