package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity172;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity172Repository extends JpaRepository<GenEntity172, UUID> {
    List<GenEntity172> findByName(String name);
    List<GenEntity172> findByStatus(String status);
    List<GenEntity172> findByType(String type);
    List<GenEntity172> findByIsActiveTrue();
}
