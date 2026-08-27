package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity263;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity263Repository extends JpaRepository<GenEntity263, UUID> {
    List<GenEntity263> findByName(String name);
    List<GenEntity263> findByStatus(String status);
    List<GenEntity263> findByType(String type);
    List<GenEntity263> findByIsActiveTrue();
}
