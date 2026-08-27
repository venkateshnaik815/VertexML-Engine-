package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity175;
import com.vertexml.generated.service.GenEntity175Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen175")
public class GenEntity175Controller {
    private final GenEntity175Service service;
    public GenEntity175Controller(GenEntity175Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity175> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity175 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity175 create(@RequestBody GenEntity175 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity175 update(@PathVariable UUID id, @RequestBody GenEntity175 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
