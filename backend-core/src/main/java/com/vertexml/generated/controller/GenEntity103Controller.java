package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity103;
import com.vertexml.generated.service.GenEntity103Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen103")
public class GenEntity103Controller {
    private final GenEntity103Service service;
    public GenEntity103Controller(GenEntity103Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity103> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity103 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity103 create(@RequestBody GenEntity103 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity103 update(@PathVariable UUID id, @RequestBody GenEntity103 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
