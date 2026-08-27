package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity90;
import com.vertexml.generated.service.GenEntity90Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen90")
public class GenEntity90Controller {
    private final GenEntity90Service service;
    public GenEntity90Controller(GenEntity90Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity90> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity90 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity90 create(@RequestBody GenEntity90 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity90 update(@PathVariable UUID id, @RequestBody GenEntity90 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
