package com.vertexml.analytics.domain;
import jakarta.persistence.*;
import java.util.UUID;
import java.time.LocalDateTime;

@Entity
@Table(name="analytics_ent_134")
public class EnterpriseAnalyticsEntity134 {
    @Id @GeneratedValue(strategy=GenerationType.UUID)
    private UUID id;
    private String name;
    private String description;
    private String status;
    private String type;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private int counter1;
    private int counter2;
    private double metric1;
    private double metric2;
    private boolean isActive;
    private boolean isDeleted;
    private String metadata;
    private String tags;

    public EnterpriseAnalyticsEntity134() {}

    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }
    public int getCounter1() { return counter1; }
    public void setCounter1(int counter1) { this.counter1 = counter1; }
    public int getCounter2() { return counter2; }
    public void setCounter2(int counter2) { this.counter2 = counter2; }
    public double getMetric1() { return metric1; }
    public void setMetric1(double metric1) { this.metric1 = metric1; }
    public double getMetric2() { return metric2; }
    public void setMetric2(double metric2) { this.metric2 = metric2; }
    public boolean isActive() { return isActive; }
    public void setActive(boolean active) { isActive = active; }
    public boolean isDeleted() { return isDeleted; }
    public void setDeleted(boolean deleted) { isDeleted = deleted; }
    public String getMetadata() { return metadata; }
    public void setMetadata(String metadata) { this.metadata = metadata; }
    public String getTags() { return tags; }
    public void setTags(String tags) { this.tags = tags; }

    public void processMetrics() {
        this.metric1 = this.counter1 * 1.5;
        this.metric2 = this.counter2 * 2.5;
    }
    
    public void reset() {
        this.counter1 = 0;
        this.counter2 = 0;
        this.metric1 = 0.0;
        this.metric2 = 0.0;
    }
}
