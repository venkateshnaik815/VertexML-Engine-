package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity192;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity192Repository extends JpaRepository<GenEntity192, UUID> {
    List<GenEntity192> findByName(String name);
    List<GenEntity192> findByStatus(String status);
    List<GenEntity192> findByType(String type);
    List<GenEntity192> findByIsActiveTrue();
}
