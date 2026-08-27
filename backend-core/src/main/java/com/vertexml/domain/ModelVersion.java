package com.vertexml.domain;
import jakarta.persistence.*;
import lombok.Data;
import java.util.UUID;
@Entity @Data public class ModelVersion { @Id private UUID id; private String version; @ManyToOne private Model model; }
