package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity110;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity110Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/110")
public class EnterpriseAnalyticsEntity110Controller {
    private final EnterpriseAnalyticsEntity110Service service;
    public EnterpriseAnalyticsEntity110Controller(EnterpriseAnalyticsEntity110Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity110> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity110 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity110 create(@RequestBody EnterpriseAnalyticsEntity110 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity110 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity110 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
