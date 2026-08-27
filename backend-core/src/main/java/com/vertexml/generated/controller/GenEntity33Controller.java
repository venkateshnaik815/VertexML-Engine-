package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity33;
import com.vertexml.generated.service.GenEntity33Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen33")
public class GenEntity33Controller {
    private final GenEntity33Service service;
    public GenEntity33Controller(GenEntity33Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity33> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity33 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity33 create(@RequestBody GenEntity33 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity33 update(@PathVariable UUID id, @RequestBody GenEntity33 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
