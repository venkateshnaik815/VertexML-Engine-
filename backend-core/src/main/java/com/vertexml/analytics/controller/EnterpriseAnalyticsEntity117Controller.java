package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity117;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity117Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/117")
public class EnterpriseAnalyticsEntity117Controller {
    private final EnterpriseAnalyticsEntity117Service service;
    public EnterpriseAnalyticsEntity117Controller(EnterpriseAnalyticsEntity117Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity117> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity117 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity117 create(@RequestBody EnterpriseAnalyticsEntity117 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity117 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity117 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
