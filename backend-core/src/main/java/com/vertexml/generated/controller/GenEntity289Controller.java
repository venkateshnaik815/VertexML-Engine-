package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity289;
import com.vertexml.generated.service.GenEntity289Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen289")
public class GenEntity289Controller {
    private final GenEntity289Service service;
    public GenEntity289Controller(GenEntity289Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity289> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity289 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity289 create(@RequestBody GenEntity289 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity289 update(@PathVariable UUID id, @RequestBody GenEntity289 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
