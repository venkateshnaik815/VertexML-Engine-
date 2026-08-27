package com.vertexml.analytics.controller;
import com.vertexml.analytics.domain.EnterpriseAnalyticsEntity72;
import com.vertexml.analytics.service.EnterpriseAnalyticsEntity72Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/analytics/72")
public class EnterpriseAnalyticsEntity72Controller {
    private final EnterpriseAnalyticsEntity72Service service;
    public EnterpriseAnalyticsEntity72Controller(EnterpriseAnalyticsEntity72Service service) { this.service = service; }
    
    @GetMapping
    public List<EnterpriseAnalyticsEntity72> getAll() { return service.getAll(); }
    
    @GetMapping("/{id}")
    public EnterpriseAnalyticsEntity72 getById(@PathVariable UUID id) { return service.getById(id); }
    
    @PostMapping
    public EnterpriseAnalyticsEntity72 create(@RequestBody EnterpriseAnalyticsEntity72 entity) { return service.create(entity); }
    
    @PutMapping("/{id}")
    public EnterpriseAnalyticsEntity72 update(@PathVariable UUID id, @RequestBody EnterpriseAnalyticsEntity72 entity) { return service.update(id, entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) { service.delete(id); }
    
    @PostMapping("/bulk-process")
    public void bulkProcess() { service.bulkProcess(); }
}
