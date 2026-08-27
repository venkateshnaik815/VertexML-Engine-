package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity97;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity97Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/97")
public class EnterpriseAnalyticsEntity97Controller {
    private final EnterpriseAnalyticsEntity97Service service;
    public EnterpriseAnalyticsEntity97Controller(EnterpriseAnalyticsEntity97Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity97> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity97 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity97 create(@RequestBody EnterpriseAnalyticsEntity97 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity97 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity97 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
