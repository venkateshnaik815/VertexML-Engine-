package com.vertexml.domain;
import jakarta.persistence.*;
import lombok.Data;
import java.util.UUID;
@Entity @Data @Table(name="endpoints") public class Endpoint { @Id @GeneratedValue(strategy=GenerationType.UUID) private UUID id; private String name; }
