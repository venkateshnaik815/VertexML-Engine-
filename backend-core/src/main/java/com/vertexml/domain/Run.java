package com.vertexml.domain;
import jakarta.persistence.*;
import lombok.Data;
import java.util.UUID;
@Entity @Data @Table(name="runs") public class Run { @Id private UUID id; private String status; @ManyToOne private Experiment experiment; }
