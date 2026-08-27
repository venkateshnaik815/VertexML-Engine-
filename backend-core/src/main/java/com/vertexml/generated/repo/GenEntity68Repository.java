package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity68;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity68Repository extends JpaRepository<GenEntity68, UUID> {
    List<GenEntity68> findByName(String name);
    List<GenEntity68> findByStatus(String status);
    List<GenEntity68> findByType(String type);
    List<GenEntity68> findByIsActiveTrue();
}
