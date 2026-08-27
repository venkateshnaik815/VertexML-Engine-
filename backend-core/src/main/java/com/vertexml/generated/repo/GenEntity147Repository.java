package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity147;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity147Repository extends JpaRepository<GenEntity147, UUID> {
    List<GenEntity147> findByName(String name);
    List<GenEntity147> findByStatus(String status);
    List<GenEntity147> findByType(String type);
    List<GenEntity147> findByIsActiveTrue();
}
