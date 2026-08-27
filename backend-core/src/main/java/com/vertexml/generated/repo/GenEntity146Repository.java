package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity146;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity146Repository extends JpaRepository<GenEntity146, UUID> {
    List<GenEntity146> findByName(String name);
    List<GenEntity146> findByStatus(String status);
    List<GenEntity146> findByType(String type);
    List<GenEntity146> findByIsActiveTrue();
}
