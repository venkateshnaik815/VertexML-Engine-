package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity16;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity16Repository extends JpaRepository<GenEntity16, UUID> {
    List<GenEntity16> findByName(String name);
    List<GenEntity16> findByStatus(String status);
    List<GenEntity16> findByType(String type);
    List<GenEntity16> findByIsActiveTrue();
}
