package com.vertexml.domain;
import jakarta.persistence.*;
import lombok.Data;
import java.util.UUID;
@Entity @Data public class Project { @Id private UUID id; private String name; @ManyToOne private Workspace workspace; }
