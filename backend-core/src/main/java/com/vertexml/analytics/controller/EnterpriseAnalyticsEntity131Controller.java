package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity131;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity131Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/131")
public class EnterpriseAnalyticsEntity131Controller {
    private final EnterpriseAnalyticsEntity131Service service;
    public EnterpriseAnalyticsEntity131Controller(EnterpriseAnalyticsEntity131Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity131> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity131 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity131 create(@RequestBody EnterpriseAnalyticsEntity131 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity131 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity131 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
