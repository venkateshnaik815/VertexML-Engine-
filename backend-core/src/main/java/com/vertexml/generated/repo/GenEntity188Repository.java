package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity188;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity188Repository extends JpaRepository<GenEntity188, UUID> {
    List<GenEntity188> findByName(String name);
    List<GenEntity188> findByStatus(String status);
    List<GenEntity188> findByType(String type);
    List<GenEntity188> findByIsActiveTrue();
}
