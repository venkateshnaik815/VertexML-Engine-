package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity271;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity271Repository extends JpaRepository<GenEntity271, UUID> {
    List<GenEntity271> findByName(String name);
    List<GenEntity271> findByStatus(String status);
    List<GenEntity271> findByType(String type);
    List<GenEntity271> findByIsActiveTrue();
}
