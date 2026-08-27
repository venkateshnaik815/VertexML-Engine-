package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity277;
import com.vertexml.generated.service.GenEntity277Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen277")
public class GenEntity277Controller {
    private final GenEntity277Service service;
    public GenEntity277Controller(GenEntity277Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity277> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity277 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity277 create(@RequestBody GenEntity277 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity277 update(@PathVariable UUID id, @RequestBody GenEntity277 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
