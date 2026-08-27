package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity56;
import com.vertexml.generated.service.GenEntity56Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen56")
public class GenEntity56Controller {
    private final GenEntity56Service service;
    public GenEntity56Controller(GenEntity56Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity56> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity56 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity56 create(@RequestBody GenEntity56 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity56 update(@PathVariable UUID id, @RequestBody GenEntity56 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
