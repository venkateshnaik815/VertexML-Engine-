package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity216;
import com.vertexml.generated.service.GenEntity216Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen216")
public class GenEntity216Controller {
    private final GenEntity216Service service;
    public GenEntity216Controller(GenEntity216Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity216> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity216 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity216 create(@RequestBody GenEntity216 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity216 update(@PathVariable UUID id, @RequestBody GenEntity216 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
