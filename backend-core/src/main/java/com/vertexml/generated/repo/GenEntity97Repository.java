package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity97;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity97Repository extends JpaRepository<GenEntity97, UUID> {
    List<GenEntity97> findByName(String name);
    List<GenEntity97> findByStatus(String status);
    List<GenEntity97> findByType(String type);
    List<GenEntity97> findByIsActiveTrue();
}
