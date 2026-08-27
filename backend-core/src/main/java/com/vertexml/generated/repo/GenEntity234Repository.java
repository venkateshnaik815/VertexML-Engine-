package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity234;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity234Repository extends JpaRepository<GenEntity234, UUID> {
    List<GenEntity234> findByName(String name);
    List<GenEntity234> findByStatus(String status);
    List<GenEntity234> findByType(String type);
    List<GenEntity234> findByIsActiveTrue();
}
