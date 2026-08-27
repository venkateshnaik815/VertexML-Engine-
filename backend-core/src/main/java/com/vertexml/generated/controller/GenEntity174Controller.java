package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity174;
import com.vertexml.generated.service.GenEntity174Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen174")
public class GenEntity174Controller {
    private final GenEntity174Service service;
    public GenEntity174Controller(GenEntity174Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity174> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity174 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity174 create(@RequestBody GenEntity174 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity174 update(@PathVariable UUID id, @RequestBody GenEntity174 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
