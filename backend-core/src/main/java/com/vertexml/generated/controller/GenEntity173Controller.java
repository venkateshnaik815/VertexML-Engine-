package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity173;
import com.vertexml.generated.service.GenEntity173Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen173")
public class GenEntity173Controller {
    private final GenEntity173Service service;
    public GenEntity173Controller(GenEntity173Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity173> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity173 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity173 create(@RequestBody GenEntity173 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity173 update(@PathVariable UUID id, @RequestBody GenEntity173 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
