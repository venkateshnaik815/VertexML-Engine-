package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity144;
import com.vertexml.generated.service.GenEntity144Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen144")
public class GenEntity144Controller {
    private final GenEntity144Service service;
    public GenEntity144Controller(GenEntity144Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity144> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity144 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity144 create(@RequestBody GenEntity144 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity144 update(@PathVariable UUID id, @RequestBody GenEntity144 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
