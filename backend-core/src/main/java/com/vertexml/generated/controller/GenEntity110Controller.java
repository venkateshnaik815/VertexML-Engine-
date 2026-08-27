package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity110;
import com.vertexml.generated.service.GenEntity110Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen110")
public class GenEntity110Controller {
    private final GenEntity110Service service;
    public GenEntity110Controller(GenEntity110Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity110> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity110 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity110 create(@RequestBody GenEntity110 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity110 update(@PathVariable UUID id, @RequestBody GenEntity110 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
