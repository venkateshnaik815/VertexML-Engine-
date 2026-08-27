package com.vertexml.domain;
import jakarta.persistence.*;
import lombok.Data;
import java.util.UUID;
@Entity @Data public class AuditLog { @Id private UUID id; private String action; private String userEmail; }
