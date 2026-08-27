package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity19;
import com.vertexml.generated.service.GenEntity19Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen19")
public class GenEntity19Controller {
    private final GenEntity19Service service;
    public GenEntity19Controller(GenEntity19Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity19> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity19 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity19 create(@RequestBody GenEntity19 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity19 update(@PathVariable UUID id, @RequestBody GenEntity19 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
