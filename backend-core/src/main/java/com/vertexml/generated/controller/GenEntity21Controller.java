package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity21;
import com.vertexml.generated.service.GenEntity21Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen21")
public class GenEntity21Controller {
    private final GenEntity21Service service;
    public GenEntity21Controller(GenEntity21Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity21> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity21 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity21 create(@RequestBody GenEntity21 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity21 update(@PathVariable UUID id, @RequestBody GenEntity21 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
