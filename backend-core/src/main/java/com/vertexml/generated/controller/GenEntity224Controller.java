package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity224;
import com.vertexml.generated.service.GenEntity224Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen224")
public class GenEntity224Controller {
    private final GenEntity224Service service;
    public GenEntity224Controller(GenEntity224Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity224> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity224 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity224 create(@RequestBody GenEntity224 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity224 update(@PathVariable UUID id, @RequestBody GenEntity224 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
