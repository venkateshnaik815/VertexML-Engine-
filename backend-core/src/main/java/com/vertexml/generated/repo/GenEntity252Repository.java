package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity252;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity252Repository extends JpaRepository<GenEntity252, UUID> {
    List<GenEntity252> findByName(String name);
    List<GenEntity252> findByStatus(String status);
    List<GenEntity252> findByType(String type);
    List<GenEntity252> findByIsActiveTrue();
}
