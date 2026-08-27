package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity31;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity31Repository extends JpaRepository<GenEntity31, UUID> {
    List<GenEntity31> findByName(String name);
    List<GenEntity31> findByStatus(String status);
    List<GenEntity31> findByType(String type);
    List<GenEntity31> findByIsActiveTrue();
}
