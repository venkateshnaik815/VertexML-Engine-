package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity120;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity120Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/120")
public class EnterpriseAnalyticsEntity120Controller {
    private final EnterpriseAnalyticsEntity120Service service;
    public EnterpriseAnalyticsEntity120Controller(EnterpriseAnalyticsEntity120Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity120> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity120 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity120 create(@RequestBody EnterpriseAnalyticsEntity120 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity120 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity120 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
