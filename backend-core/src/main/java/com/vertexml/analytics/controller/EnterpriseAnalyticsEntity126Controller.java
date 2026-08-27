package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity126;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity126Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/126")
public class EnterpriseAnalyticsEntity126Controller {
    private final EnterpriseAnalyticsEntity126Service service;
    public EnterpriseAnalyticsEntity126Controller(EnterpriseAnalyticsEntity126Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity126> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity126 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity126 create(@RequestBody EnterpriseAnalyticsEntity126 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity126 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity126 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
