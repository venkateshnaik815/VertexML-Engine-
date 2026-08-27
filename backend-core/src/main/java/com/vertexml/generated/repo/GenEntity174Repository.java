package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity174;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity174Repository extends JpaRepository<GenEntity174, UUID> {
    List<GenEntity174> findByName(String name);
    List<GenEntity174> findByStatus(String status);
    List<GenEntity174> findByType(String type);
    List<GenEntity174> findByIsActiveTrue();
}
