package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity215;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity215Repository extends JpaRepository<GenEntity215, UUID> {
    List<GenEntity215> findByName(String name);
    List<GenEntity215> findByStatus(String status);
    List<GenEntity215> findByType(String type);
    List<GenEntity215> findByIsActiveTrue();
}
