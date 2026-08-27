package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity22;
import com.vertexml.generated.service.GenEntity22Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen22")
public class GenEntity22Controller {
    private final GenEntity22Service service;
    public GenEntity22Controller(GenEntity22Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity22> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity22 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity22 create(@RequestBody GenEntity22 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity22 update(@PathVariable UUID id, @RequestBody GenEntity22 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
