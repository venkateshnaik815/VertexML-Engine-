package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity9;
import com.vertexml.generated.service.GenEntity9Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen9")
public class GenEntity9Controller {
    private final GenEntity9Service service;
    public GenEntity9Controller(GenEntity9Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity9> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity9 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity9 create(@RequestBody GenEntity9 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity9 update(@PathVariable UUID id, @RequestBody GenEntity9 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
