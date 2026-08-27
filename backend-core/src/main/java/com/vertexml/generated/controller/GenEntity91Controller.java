package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity91;
import com.vertexml.generated.service.GenEntity91Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen91")
public class GenEntity91Controller {
    private final GenEntity91Service service;
    public GenEntity91Controller(GenEntity91Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity91> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity91 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity91 create(@RequestBody GenEntity91 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity91 update(@PathVariable UUID id, @RequestBody GenEntity91 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
