package com.vertexml.billing.controller;
import com.vertexml.billing.domain.EnterpriseBillingEntity62;
import com.vertexml.billing.service.EnterpriseBillingEntity62Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/billing/62")
public class EnterpriseBillingEntity62Controller {
    private final EnterpriseBillingEntity62Service service;
    public EnterpriseBillingEntity62Controller(EnterpriseBillingEntity62Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseBillingEntity62> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseBillingEntity62 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseBillingEntity62 create(@RequestBody EnterpriseBillingEntity62 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseBillingEntity62 update(@PathVariable UUID id, @RequestBody EnterpriseBillingEntity62 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
