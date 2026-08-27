package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity247;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity247Repository extends JpaRepository<GenEntity247, UUID> {
    List<GenEntity247> findByName(String name);
    List<GenEntity247> findByStatus(String status);
    List<GenEntity247> findByType(String type);
    List<GenEntity247> findByIsActiveTrue();
}
