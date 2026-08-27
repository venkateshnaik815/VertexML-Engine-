package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity201;
import com.vertexml.generated.service.GenEntity201Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen201")
public class GenEntity201Controller {
    private final GenEntity201Service service;
    public GenEntity201Controller(GenEntity201Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity201> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity201 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity201 create(@RequestBody GenEntity201 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity201 update(@PathVariable UUID id, @RequestBody GenEntity201 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
