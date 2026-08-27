package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity36;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity36Repository extends JpaRepository<GenEntity36, UUID> {
    List<GenEntity36> findByName(String name);
    List<GenEntity36> findByStatus(String status);
    List<GenEntity36> findByType(String type);
    List<GenEntity36> findByIsActiveTrue();
}
