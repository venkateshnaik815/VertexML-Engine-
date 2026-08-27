package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity155;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity155Repository extends JpaRepository<GenEntity155, UUID> {
    List<GenEntity155> findByName(String name);
    List<GenEntity155> findByStatus(String status);
    List<GenEntity155> findByType(String type);
    List<GenEntity155> findByIsActiveTrue();
}
