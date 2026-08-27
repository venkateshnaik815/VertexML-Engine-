package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity18;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity18Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/18")
public class EnterpriseAnalyticsEntity18Controller {
    private final EnterpriseAnalyticsEntity18Service service;
    public EnterpriseAnalyticsEntity18Controller(EnterpriseAnalyticsEntity18Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity18> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity18 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity18 create(@RequestBody EnterpriseAnalyticsEntity18 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity18 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity18 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
