package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity13;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity13Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/13")
public class EnterpriseAnalyticsEntity13Controller {
    private final EnterpriseAnalyticsEntity13Service service;
    public EnterpriseAnalyticsEntity13Controller(EnterpriseAnalyticsEntity13Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity13> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity13 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity13 create(@RequestBody EnterpriseAnalyticsEntity13 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity13 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity13 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
