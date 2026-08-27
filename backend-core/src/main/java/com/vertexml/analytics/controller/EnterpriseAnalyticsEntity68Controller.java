package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity68;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity68Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/68")
public class EnterpriseAnalyticsEntity68Controller {
    private final EnterpriseAnalyticsEntity68Service service;
    public EnterpriseAnalyticsEntity68Controller(EnterpriseAnalyticsEntity68Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity68> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity68 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity68 create(@RequestBody EnterpriseAnalyticsEntity68 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity68 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity68 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
