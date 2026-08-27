package com.vertexml.domain;
import jakarta.persistence.*;
import lombok.Data;
import java.util.UUID;
@Entity @Data public class Experiment { @Id private UUID id; private String name; @ManyToOne private Project project; }
