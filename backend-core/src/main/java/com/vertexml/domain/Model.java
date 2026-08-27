package com.vertexml.domain;
import jakarta.persistence.*;
import lombok.Data;
import java.util.UUID;
@Entity @Data @Table(name="models") public class Model { @Id @GeneratedValue(strategy=GenerationType.UUID) private UUID id; private String name; }

