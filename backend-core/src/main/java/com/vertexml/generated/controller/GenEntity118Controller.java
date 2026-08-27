package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity118;
import com.vertexml.generated.service.GenEntity118Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen118")
public class GenEntity118Controller {
    private final GenEntity118Service service;
    public GenEntity118Controller(GenEntity118Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity118> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity118 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity118 create(@RequestBody GenEntity118 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity118 update(@PathVariable UUID id, @RequestBody GenEntity118 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
