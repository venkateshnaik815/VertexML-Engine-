package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity122;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity122Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/122")
public class EnterpriseAnalyticsEntity122Controller {
    private final EnterpriseAnalyticsEntity122Service service;
    public EnterpriseAnalyticsEntity122Controller(EnterpriseAnalyticsEntity122Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity122> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity122 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity122 create(@RequestBody EnterpriseAnalyticsEntity122 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity122 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity122 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
