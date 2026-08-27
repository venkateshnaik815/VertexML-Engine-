package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity71;
import com.vertexml.generated.service.GenEntity71Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen71")
public class GenEntity71Controller {
    private final GenEntity71Service service;
    public GenEntity71Controller(GenEntity71Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity71> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity71 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity71 create(@RequestBody GenEntity71 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity71 update(@PathVariable UUID id, @RequestBody GenEntity71 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
