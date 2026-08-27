package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity181;
import com.vertexml.generated.service.GenEntity181Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen181")
public class GenEntity181Controller {
    private final GenEntity181Service service;
    public GenEntity181Controller(GenEntity181Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity181> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity181 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity181 create(@RequestBody GenEntity181 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity181 update(@PathVariable UUID id, @RequestBody GenEntity181 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
