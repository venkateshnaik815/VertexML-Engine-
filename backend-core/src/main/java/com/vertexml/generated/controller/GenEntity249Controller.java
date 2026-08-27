package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity249;
import com.vertexml.generated.service.GenEntity249Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen249")
public class GenEntity249Controller {
    private final GenEntity249Service service;
    public GenEntity249Controller(GenEntity249Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity249> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity249 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity249 create(@RequestBody GenEntity249 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity249 update(@PathVariable UUID id, @RequestBody GenEntity249 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
