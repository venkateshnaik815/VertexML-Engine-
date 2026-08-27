package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity124;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity124Repository extends JpaRepository<GenEntity124, UUID> {
    List<GenEntity124> findByName(String name);
    List<GenEntity124> findByStatus(String status);
    List<GenEntity124> findByType(String type);
    List<GenEntity124> findByIsActiveTrue();
}
