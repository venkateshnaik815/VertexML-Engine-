package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity128;
import com.vertexml.generated.service.GenEntity128Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen128")
public class GenEntity128Controller {
    private final GenEntity128Service service;
    public GenEntity128Controller(GenEntity128Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity128> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity128 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity128 create(@RequestBody GenEntity128 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity128 update(@PathVariable UUID id, @RequestBody GenEntity128 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
