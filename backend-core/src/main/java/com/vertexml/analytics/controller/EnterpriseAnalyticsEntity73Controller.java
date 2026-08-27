package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity73;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity73Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/73")
public class EnterpriseAnalyticsEntity73Controller {
    private final EnterpriseAnalyticsEntity73Service service;
    public EnterpriseAnalyticsEntity73Controller(EnterpriseAnalyticsEntity73Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity73> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity73 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity73 create(@RequestBody EnterpriseAnalyticsEntity73 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity73 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity73 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
