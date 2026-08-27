package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity116;
import com.vertexml.generated.service.GenEntity116Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen116")
public class GenEntity116Controller {
    private final GenEntity116Service service;
    public GenEntity116Controller(GenEntity116Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity116> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity116 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity116 create(@RequestBody GenEntity116 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity116 update(@PathVariable UUID id, @RequestBody GenEntity116 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
