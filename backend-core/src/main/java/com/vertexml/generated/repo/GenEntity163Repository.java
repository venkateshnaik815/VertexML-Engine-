package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity163;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity163Repository extends JpaRepository<GenEntity163, UUID> {
    List<GenEntity163> findByName(String name);
    List<GenEntity163> findByStatus(String status);
    List<GenEntity163> findByType(String type);
    List<GenEntity163> findByIsActiveTrue();
}
