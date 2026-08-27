package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity10;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity10Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/10")
public class EnterpriseAnalyticsEntity10Controller {
    private final EnterpriseAnalyticsEntity10Service service;
    public EnterpriseAnalyticsEntity10Controller(EnterpriseAnalyticsEntity10Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity10> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity10 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity10 create(@RequestBody EnterpriseAnalyticsEntity10 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity10 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity10 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
