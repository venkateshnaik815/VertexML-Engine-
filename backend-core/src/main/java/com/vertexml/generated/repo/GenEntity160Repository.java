package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity160;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity160Repository extends JpaRepository<GenEntity160, UUID> {
    List<GenEntity160> findByName(String name);
    List<GenEntity160> findByStatus(String status);
    List<GenEntity160> findByType(String type);
    List<GenEntity160> findByIsActiveTrue();
}
