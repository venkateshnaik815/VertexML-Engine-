package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity299;
import com.vertexml.generated.service.GenEntity299Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen299")
public class GenEntity299Controller {
    private final GenEntity299Service service;
    public GenEntity299Controller(GenEntity299Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity299> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity299 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity299 create(@RequestBody GenEntity299 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity299 update(@PathVariable UUID id, @RequestBody GenEntity299 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
