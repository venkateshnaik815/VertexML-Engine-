package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity91;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity91Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/91")
public class EnterpriseAnalyticsEntity91Controller {
    private final EnterpriseAnalyticsEntity91Service service;
    public EnterpriseAnalyticsEntity91Controller(EnterpriseAnalyticsEntity91Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity91> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity91 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity91 create(@RequestBody EnterpriseAnalyticsEntity91 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity91 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity91 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
