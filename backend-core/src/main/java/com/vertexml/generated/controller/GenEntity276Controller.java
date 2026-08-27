package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity276;
import com.vertexml.generated.service.GenEntity276Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen276")
public class GenEntity276Controller {
    private final GenEntity276Service service;
    public GenEntity276Controller(GenEntity276Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity276> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity276 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity276 create(@RequestBody GenEntity276 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity276 update(@PathVariable UUID id, @RequestBody GenEntity276 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
