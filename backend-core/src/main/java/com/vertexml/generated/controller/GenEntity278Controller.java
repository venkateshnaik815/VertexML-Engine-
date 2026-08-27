package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity278;
import com.vertexml.generated.service.GenEntity278Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen278")
public class GenEntity278Controller {
    private final GenEntity278Service service;
    public GenEntity278Controller(GenEntity278Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity278> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity278 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity278 create(@RequestBody GenEntity278 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity278 update(@PathVariable UUID id, @RequestBody GenEntity278 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
