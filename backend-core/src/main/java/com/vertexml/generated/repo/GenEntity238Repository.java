package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity238;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity238Repository extends JpaRepository<GenEntity238, UUID> {
    List<GenEntity238> findByName(String name);
    List<GenEntity238> findByStatus(String status);
    List<GenEntity238> findByType(String type);
    List<GenEntity238> findByIsActiveTrue();
}
