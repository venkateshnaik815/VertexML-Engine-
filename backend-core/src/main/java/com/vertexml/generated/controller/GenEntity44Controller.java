package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity44;
import com.vertexml.generated.service.GenEntity44Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen44")
public class GenEntity44Controller {
    private final GenEntity44Service service;
    public GenEntity44Controller(GenEntity44Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity44> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity44 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity44 create(@RequestBody GenEntity44 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity44 update(@PathVariable UUID id, @RequestBody GenEntity44 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
