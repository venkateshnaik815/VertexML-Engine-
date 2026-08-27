package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity197;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity197Repository extends JpaRepository<GenEntity197, UUID> {
    List<GenEntity197> findByName(String name);
    List<GenEntity197> findByStatus(String status);
    List<GenEntity197> findByType(String type);
    List<GenEntity197> findByIsActiveTrue();
}
