package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity279;
import com.vertexml.generated.service.GenEntity279Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen279")
public class GenEntity279Controller {
    private final GenEntity279Service service;
    public GenEntity279Controller(GenEntity279Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity279> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity279 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity279 create(@RequestBody GenEntity279 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity279 update(@PathVariable UUID id, @RequestBody GenEntity279 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
