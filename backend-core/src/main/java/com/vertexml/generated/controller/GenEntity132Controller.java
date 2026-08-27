package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity132;
import com.vertexml.generated.service.GenEntity132Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen132")
public class GenEntity132Controller {
    private final GenEntity132Service service;
    public GenEntity132Controller(GenEntity132Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity132> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity132 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity132 create(@RequestBody GenEntity132 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity132 update(@PathVariable UUID id, @RequestBody GenEntity132 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
