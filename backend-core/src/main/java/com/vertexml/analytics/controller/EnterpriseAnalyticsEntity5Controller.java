package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity5;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity5Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/5")
public class EnterpriseAnalyticsEntity5Controller {
    private final EnterpriseAnalyticsEntity5Service service;
    public EnterpriseAnalyticsEntity5Controller(EnterpriseAnalyticsEntity5Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity5> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity5 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity5 create(@RequestBody EnterpriseAnalyticsEntity5 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity5 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity5 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
