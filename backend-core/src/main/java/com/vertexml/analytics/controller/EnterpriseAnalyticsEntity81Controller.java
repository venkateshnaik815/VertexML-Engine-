package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity81;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity81Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/81")
public class EnterpriseAnalyticsEntity81Controller {
    private final EnterpriseAnalyticsEntity81Service service;
    public EnterpriseAnalyticsEntity81Controller(EnterpriseAnalyticsEntity81Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity81> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity81 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity81 create(@RequestBody EnterpriseAnalyticsEntity81 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity81 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity81 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
