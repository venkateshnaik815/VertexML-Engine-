package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity141;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity141Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/141")
public class EnterpriseAnalyticsEntity141Controller {
    private final EnterpriseAnalyticsEntity141Service service;
    public EnterpriseAnalyticsEntity141Controller(EnterpriseAnalyticsEntity141Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity141> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity141 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity141 create(@RequestBody EnterpriseAnalyticsEntity141 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity141 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity141 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
