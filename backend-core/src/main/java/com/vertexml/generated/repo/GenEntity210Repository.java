package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity210;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity210Repository extends JpaRepository<GenEntity210, UUID> {
    List<GenEntity210> findByName(String name);
    List<GenEntity210> findByStatus(String status);
    List<GenEntity210> findByType(String type);
    List<GenEntity210> findByIsActiveTrue();
}
