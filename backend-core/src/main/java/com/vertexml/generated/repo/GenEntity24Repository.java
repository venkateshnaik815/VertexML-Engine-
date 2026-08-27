package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity24;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity24Repository extends JpaRepository<GenEntity24, UUID> {
    List<GenEntity24> findByName(String name);
    List<GenEntity24> findByStatus(String status);
    List<GenEntity24> findByType(String type);
    List<GenEntity24> findByIsActiveTrue();
}
