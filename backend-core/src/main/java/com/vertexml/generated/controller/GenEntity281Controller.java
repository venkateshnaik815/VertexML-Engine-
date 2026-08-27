package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity281;
import com.vertexml.generated.service.GenEntity281Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen281")
public class GenEntity281Controller {
    private final GenEntity281Service service;
    public GenEntity281Controller(GenEntity281Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity281> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity281 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity281 create(@RequestBody GenEntity281 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity281 update(@PathVariable UUID id, @RequestBody GenEntity281 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
