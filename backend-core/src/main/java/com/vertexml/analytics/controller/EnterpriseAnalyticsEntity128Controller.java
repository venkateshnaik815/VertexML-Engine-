package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity128;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity128Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/128")
public class EnterpriseAnalyticsEntity128Controller {
    private final EnterpriseAnalyticsEntity128Service service;
    public EnterpriseAnalyticsEntity128Controller(EnterpriseAnalyticsEntity128Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity128> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity128 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity128 create(@RequestBody EnterpriseAnalyticsEntity128 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity128 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity128 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
