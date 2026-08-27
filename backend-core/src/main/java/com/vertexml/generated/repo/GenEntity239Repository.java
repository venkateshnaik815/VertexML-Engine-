package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity239;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity239Repository extends JpaRepository<GenEntity239, UUID> {
    List<GenEntity239> findByName(String name);
    List<GenEntity239> findByStatus(String status);
    List<GenEntity239> findByType(String type);
    List<GenEntity239> findByIsActiveTrue();
}
