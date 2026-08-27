package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity147;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity147Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/147")
public class EnterpriseAnalyticsEntity147Controller {
    private final EnterpriseAnalyticsEntity147Service service;
    public EnterpriseAnalyticsEntity147Controller(EnterpriseAnalyticsEntity147Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity147> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity147 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity147 create(@RequestBody EnterpriseAnalyticsEntity147 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity147 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity147 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
