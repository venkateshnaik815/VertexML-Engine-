package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity246;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity246Repository extends JpaRepository<GenEntity246, UUID> {
    List<GenEntity246> findByName(String name);
    List<GenEntity246> findByStatus(String status);
    List<GenEntity246> findByType(String type);
    List<GenEntity246> findByIsActiveTrue();
}
