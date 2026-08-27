package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity28;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity28Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/28")
public class EnterpriseAnalyticsEntity28Controller {
    private final EnterpriseAnalyticsEntity28Service service;
    public EnterpriseAnalyticsEntity28Controller(EnterpriseAnalyticsEntity28Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity28> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity28 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity28 create(@RequestBody EnterpriseAnalyticsEntity28 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity28 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity28 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
