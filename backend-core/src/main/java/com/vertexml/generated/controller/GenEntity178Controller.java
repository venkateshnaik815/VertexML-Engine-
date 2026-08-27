package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity178;
import com.vertexml.generated.service.GenEntity178Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen178")
public class GenEntity178Controller {
    private final GenEntity178Service service;
    public GenEntity178Controller(GenEntity178Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity178> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity178 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity178 create(@RequestBody GenEntity178 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity178 update(@PathVariable UUID id, @RequestBody GenEntity178 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
