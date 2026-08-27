package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity2;
import com.vertexml.generated.service.GenEntity2Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen2")
public class GenEntity2Controller {
    private final GenEntity2Service service;
    public GenEntity2Controller(GenEntity2Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity2> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity2 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity2 create(@RequestBody GenEntity2 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity2 update(@PathVariable UUID id, @RequestBody GenEntity2 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
