package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity186;
import com.vertexml.generated.service.GenEntity186Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen186")
public class GenEntity186Controller {
    private final GenEntity186Service service;
    public GenEntity186Controller(GenEntity186Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity186> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity186 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity186 create(@RequestBody GenEntity186 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity186 update(@PathVariable UUID id, @RequestBody GenEntity186 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
