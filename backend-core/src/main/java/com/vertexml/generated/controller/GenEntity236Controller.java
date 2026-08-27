package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity236;
import com.vertexml.generated.service.GenEntity236Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen236")
public class GenEntity236Controller {
    private final GenEntity236Service service;
    public GenEntity236Controller(GenEntity236Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity236> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity236 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity236 create(@RequestBody GenEntity236 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity236 update(@PathVariable UUID id, @RequestBody GenEntity236 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
