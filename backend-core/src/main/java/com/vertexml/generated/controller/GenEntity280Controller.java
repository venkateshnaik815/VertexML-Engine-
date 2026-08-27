package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity280;
import com.vertexml.generated.service.GenEntity280Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen280")
public class GenEntity280Controller {
    private final GenEntity280Service service;
    public GenEntity280Controller(GenEntity280Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity280> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity280 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity280 create(@RequestBody GenEntity280 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity280 update(@PathVariable UUID id, @RequestBody GenEntity280 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
