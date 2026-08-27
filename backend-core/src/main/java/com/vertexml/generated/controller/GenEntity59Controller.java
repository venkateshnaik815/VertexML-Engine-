package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity59;
import com.vertexml.generated.service.GenEntity59Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen59")
public class GenEntity59Controller {
    private final GenEntity59Service service;
    public GenEntity59Controller(GenEntity59Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity59> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity59 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity59 create(@RequestBody GenEntity59 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity59 update(@PathVariable UUID id, @RequestBody GenEntity59 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
