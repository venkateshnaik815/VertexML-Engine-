package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity226;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity226Repository extends JpaRepository<GenEntity226, UUID> {
    List<GenEntity226> findByName(String name);
    List<GenEntity226> findByStatus(String status);
    List<GenEntity226> findByType(String type);
    List<GenEntity226> findByIsActiveTrue();
}
