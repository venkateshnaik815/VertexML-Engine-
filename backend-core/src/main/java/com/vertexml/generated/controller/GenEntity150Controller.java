package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity150;
import com.vertexml.generated.service.GenEntity150Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen150")
public class GenEntity150Controller {
    private final GenEntity150Service service;
    public GenEntity150Controller(GenEntity150Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity150> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity150 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity150 create(@RequestBody GenEntity150 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity150 update(@PathVariable UUID id, @RequestBody GenEntity150 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
