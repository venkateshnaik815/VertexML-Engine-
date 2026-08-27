package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity15;
import com.vertexml.generated.service.GenEntity15Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen15")
public class GenEntity15Controller {
    private final GenEntity15Service service;
    public GenEntity15Controller(GenEntity15Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity15> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity15 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity15 create(@RequestBody GenEntity15 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity15 update(@PathVariable UUID id, @RequestBody GenEntity15 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
