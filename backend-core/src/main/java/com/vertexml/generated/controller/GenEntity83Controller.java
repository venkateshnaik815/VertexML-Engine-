package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity83;
import com.vertexml.generated.service.GenEntity83Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen83")
public class GenEntity83Controller {
    private final GenEntity83Service service;
    public GenEntity83Controller(GenEntity83Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity83> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity83 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity83 create(@RequestBody GenEntity83 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity83 update(@PathVariable UUID id, @RequestBody GenEntity83 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
