package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity28;
import com.vertexml.generated.service.GenEntity28Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen28")
public class GenEntity28Controller {
    private final GenEntity28Service service;
    public GenEntity28Controller(GenEntity28Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity28> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity28 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity28 create(@RequestBody GenEntity28 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity28 update(@PathVariable UUID id, @RequestBody GenEntity28 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
