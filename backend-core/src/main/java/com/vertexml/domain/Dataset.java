package com.vertexml.domain;
import jakarta.persistence.*;
import lombok.Data;
import java.util.UUID;
@Entity @Data public class Dataset { @Id private UUID id; private String name; private String s3Path; }
