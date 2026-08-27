package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity58;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity58Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/58")
public class EnterpriseAnalyticsEntity58Controller {
    private final EnterpriseAnalyticsEntity58Service service;
    public EnterpriseAnalyticsEntity58Controller(EnterpriseAnalyticsEntity58Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity58> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity58 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity58 create(@RequestBody EnterpriseAnalyticsEntity58 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity58 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity58 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
