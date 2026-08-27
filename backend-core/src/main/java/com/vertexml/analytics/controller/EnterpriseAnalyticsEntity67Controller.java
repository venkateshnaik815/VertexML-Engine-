package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity67;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity67Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/67")
public class EnterpriseAnalyticsEntity67Controller {
    private final EnterpriseAnalyticsEntity67Service service;
    public EnterpriseAnalyticsEntity67Controller(EnterpriseAnalyticsEntity67Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity67> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity67 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity67 create(@RequestBody EnterpriseAnalyticsEntity67 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity67 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity67 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
