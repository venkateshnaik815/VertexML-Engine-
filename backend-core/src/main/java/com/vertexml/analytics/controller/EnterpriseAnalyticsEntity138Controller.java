package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity138;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity138Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/138")
public class EnterpriseAnalyticsEntity138Controller {
    private final EnterpriseAnalyticsEntity138Service service;
    public EnterpriseAnalyticsEntity138Controller(EnterpriseAnalyticsEntity138Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity138> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity138 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity138 create(@RequestBody EnterpriseAnalyticsEntity138 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity138 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity138 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
