package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity267;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity267Repository extends JpaRepository<GenEntity267, UUID> {
    List<GenEntity267> findByName(String name);
    List<GenEntity267> findByStatus(String status);
    List<GenEntity267> findByType(String type);
    List<GenEntity267> findByIsActiveTrue();
}
