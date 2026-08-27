package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity30;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity30Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/30")
public class EnterpriseAnalyticsEntity30Controller {
    private final EnterpriseAnalyticsEntity30Service service;
    public EnterpriseAnalyticsEntity30Controller(EnterpriseAnalyticsEntity30Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity30> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity30 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity30 create(@RequestBody EnterpriseAnalyticsEntity30 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity30 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity30 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
