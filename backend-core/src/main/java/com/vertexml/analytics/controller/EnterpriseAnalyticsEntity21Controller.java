package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity21;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity21Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/21")
public class EnterpriseAnalyticsEntity21Controller {
    private final EnterpriseAnalyticsEntity21Service service;
    public EnterpriseAnalyticsEntity21Controller(EnterpriseAnalyticsEntity21Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity21> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity21 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity21 create(@RequestBody EnterpriseAnalyticsEntity21 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity21 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity21 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
