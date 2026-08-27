package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity51;
import com.vertexml.generated.service.GenEntity51Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen51")
public class GenEntity51Controller {
    private final GenEntity51Service service;
    public GenEntity51Controller(GenEntity51Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity51> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity51 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity51 create(@RequestBody GenEntity51 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity51 update(@PathVariable UUID id, @RequestBody GenEntity51 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
