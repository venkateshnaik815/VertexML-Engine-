package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity23;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity23Repository extends JpaRepository<GenEntity23, UUID> {
    List<GenEntity23> findByName(String name);
    List<GenEntity23> findByStatus(String status);
    List<GenEntity23> findByType(String type);
    List<GenEntity23> findByIsActiveTrue();
}
