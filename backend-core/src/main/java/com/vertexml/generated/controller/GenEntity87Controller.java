package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity87;
import com.vertexml.generated.service.GenEntity87Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen87")
public class GenEntity87Controller {
    private final GenEntity87Service service;
    public GenEntity87Controller(GenEntity87Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity87> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity87 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity87 create(@RequestBody GenEntity87 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity87 update(@PathVariable UUID id, @RequestBody GenEntity87 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
