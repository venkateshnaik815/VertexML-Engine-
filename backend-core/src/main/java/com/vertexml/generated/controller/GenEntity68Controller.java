package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity68;
import com.vertexml.generated.service.GenEntity68Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen68")
public class GenEntity68Controller {
    private final GenEntity68Service service;
    public GenEntity68Controller(GenEntity68Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity68> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity68 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity68 create(@RequestBody GenEntity68 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity68 update(@PathVariable UUID id, @RequestBody GenEntity68 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
