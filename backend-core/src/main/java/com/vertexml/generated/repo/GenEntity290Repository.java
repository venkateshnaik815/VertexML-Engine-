package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity290;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity290Repository extends JpaRepository<GenEntity290, UUID> {
    List<GenEntity290> findByName(String name);
    List<GenEntity290> findByStatus(String status);
    List<GenEntity290> findByType(String type);
    List<GenEntity290> findByIsActiveTrue();
}
