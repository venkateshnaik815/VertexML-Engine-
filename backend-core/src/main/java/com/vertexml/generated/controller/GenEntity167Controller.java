package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity167;
import com.vertexml.generated.service.GenEntity167Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen167")
public class GenEntity167Controller {
    private final GenEntity167Service service;
    public GenEntity167Controller(GenEntity167Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity167> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity167 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity167 create(@RequestBody GenEntity167 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity167 update(@PathVariable UUID id, @RequestBody GenEntity167 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
