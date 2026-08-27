package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity111;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity111Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/111")
public class EnterpriseAnalyticsEntity111Controller {
    private final EnterpriseAnalyticsEntity111Service service;
    public EnterpriseAnalyticsEntity111Controller(EnterpriseAnalyticsEntity111Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity111> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity111 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity111 create(@RequestBody EnterpriseAnalyticsEntity111 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity111 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity111 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
