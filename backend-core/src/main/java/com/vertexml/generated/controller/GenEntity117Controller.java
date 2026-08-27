package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity117;
import com.vertexml.generated.service.GenEntity117Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen117")
public class GenEntity117Controller {
    private final GenEntity117Service service;
    public GenEntity117Controller(GenEntity117Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity117> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity117 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity117 create(@RequestBody GenEntity117 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity117 update(@PathVariable UUID id, @RequestBody GenEntity117 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
