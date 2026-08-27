package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity94;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity94Repository extends JpaRepository<GenEntity94, UUID> {
    List<GenEntity94> findByName(String name);
    List<GenEntity94> findByStatus(String status);
    List<GenEntity94> findByType(String type);
    List<GenEntity94> findByIsActiveTrue();
}
