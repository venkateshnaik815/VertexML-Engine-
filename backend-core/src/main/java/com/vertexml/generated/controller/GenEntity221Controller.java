package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity221;
import com.vertexml.generated.service.GenEntity221Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen221")
public class GenEntity221Controller {
    private final GenEntity221Service service;
    public GenEntity221Controller(GenEntity221Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity221> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity221 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity221 create(@RequestBody GenEntity221 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity221 update(@PathVariable UUID id, @RequestBody GenEntity221 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
