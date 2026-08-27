package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity125;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity125Repository extends JpaRepository<GenEntity125, UUID> {
    List<GenEntity125> findByName(String name);
    List<GenEntity125> findByStatus(String status);
    List<GenEntity125> findByType(String type);
    List<GenEntity125> findByIsActiveTrue();
}
