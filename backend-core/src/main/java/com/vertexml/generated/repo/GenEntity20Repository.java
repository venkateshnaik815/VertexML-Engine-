package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity20;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity20Repository extends JpaRepository<GenEntity20, UUID> {
    List<GenEntity20> findByName(String name);
    List<GenEntity20> findByStatus(String status);
    List<GenEntity20> findByType(String type);
    List<GenEntity20> findByIsActiveTrue();
}
