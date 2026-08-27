package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity156;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity156Repository extends JpaRepository<GenEntity156, UUID> {
    List<GenEntity156> findByName(String name);
    List<GenEntity156> findByStatus(String status);
    List<GenEntity156> findByType(String type);
    List<GenEntity156> findByIsActiveTrue();
}
