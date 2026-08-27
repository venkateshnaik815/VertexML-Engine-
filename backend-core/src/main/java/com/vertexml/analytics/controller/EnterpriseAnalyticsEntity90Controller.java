package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity90;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity90Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/90")
public class EnterpriseAnalyticsEntity90Controller {
    private final EnterpriseAnalyticsEntity90Service service;
    public EnterpriseAnalyticsEntity90Controller(EnterpriseAnalyticsEntity90Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity90> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity90 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity90 create(@RequestBody EnterpriseAnalyticsEntity90 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity90 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity90 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
