package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity146;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity146Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/146")
public class EnterpriseAnalyticsEntity146Controller {
    private final EnterpriseAnalyticsEntity146Service service;
    public EnterpriseAnalyticsEntity146Controller(EnterpriseAnalyticsEntity146Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity146> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity146 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity146 create(@RequestBody EnterpriseAnalyticsEntity146 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity146 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity146 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
