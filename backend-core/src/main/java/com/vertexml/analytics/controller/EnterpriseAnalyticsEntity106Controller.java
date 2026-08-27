package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity106;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity106Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/106")
public class EnterpriseAnalyticsEntity106Controller {
    private final EnterpriseAnalyticsEntity106Service service;
    public EnterpriseAnalyticsEntity106Controller(EnterpriseAnalyticsEntity106Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity106> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity106 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity106 create(@RequestBody EnterpriseAnalyticsEntity106 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity106 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity106 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
