package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity111;
import com.vertexml.generated.service.GenEntity111Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen111")
public class GenEntity111Controller {
    private final GenEntity111Service service;
    public GenEntity111Controller(GenEntity111Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity111> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity111 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity111 create(@RequestBody GenEntity111 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity111 update(@PathVariable UUID id, @RequestBody GenEntity111 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
