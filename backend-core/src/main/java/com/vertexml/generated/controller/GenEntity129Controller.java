package com.vertexml.generated.controller;
import com.vertexml.generated.domain.GenEntity129;
import com.vertexml.generated.service.GenEntity129Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/gen129")
public class GenEntity129Controller {
    private final GenEntity129Service service;
    public GenEntity129Controller(GenEntity129Service service) { this.service = service; }
    
    @GetMapping
    public List<GenEntity129> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public GenEntity129 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public GenEntity129 create(@RequestBody GenEntity129 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public GenEntity129 update(@PathVariable UUID id, @RequestBody GenEntity129 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
