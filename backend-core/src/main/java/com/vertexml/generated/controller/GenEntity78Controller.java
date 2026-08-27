package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity78;
import com.vertexml.generated.service.GenEntity78Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen78")
public class GenEntity78Controller {
    private final GenEntity78Service service;
    public GenEntity78Controller(GenEntity78Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity78> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity78 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity78 create(@RequestBody GenEntity78 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity78 update(@PathVariable UUID id, @RequestBody GenEntity78 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
