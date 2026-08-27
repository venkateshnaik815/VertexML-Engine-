package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity266;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity266Repository extends JpaRepository<GenEntity266, UUID> {
    List<GenEntity266> findByName(String name);
    List<GenEntity266> findByStatus(String status);
    List<GenEntity266> findByType(String type);
    List<GenEntity266> findByIsActiveTrue();
}
