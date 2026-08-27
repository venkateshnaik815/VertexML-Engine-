package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity269;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity269Repository extends JpaRepository<GenEntity269, UUID> {
    List<GenEntity269> findByName(String name);
    List<GenEntity269> findByStatus(String status);
    List<GenEntity269> findByType(String type);
    List<GenEntity269> findByIsActiveTrue();
}
