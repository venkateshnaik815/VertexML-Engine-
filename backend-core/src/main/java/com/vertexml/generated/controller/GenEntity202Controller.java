package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity202;
import com.vertexml.generated.service.GenEntity202Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen202")
public class GenEntity202Controller {
    private final GenEntity202Service service;
    public GenEntity202Controller(GenEntity202Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity202> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity202 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity202 create(@RequestBody GenEntity202 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity202 update(@PathVariable UUID id, @RequestBody GenEntity202 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
