package com.vertexml.domain;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
public interface EndpointRepository extends JpaRepository<Endpoint, UUID> {}
