package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity195;
import com.vertexml.generated.service.GenEntity195Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen195")
public class GenEntity195Controller {
    private final GenEntity195Service service;
    public GenEntity195Controller(GenEntity195Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity195> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity195 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity195 create(@RequestBody GenEntity195 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity195 update(@PathVariable UUID id, @RequestBody GenEntity195 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
