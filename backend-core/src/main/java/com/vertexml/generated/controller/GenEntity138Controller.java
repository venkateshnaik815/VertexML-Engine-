package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity138;
import com.vertexml.generated.service.GenEntity138Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen138")
public class GenEntity138Controller {
    private final GenEntity138Service service;
    public GenEntity138Controller(GenEntity138Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity138> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity138 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity138 create(@RequestBody GenEntity138 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity138 update(@PathVariable UUID id, @RequestBody GenEntity138 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
