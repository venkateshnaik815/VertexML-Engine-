package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity166;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity166Repository extends JpaRepository<GenEntity166, UUID> {
    List<GenEntity166> findByName(String name);
    List<GenEntity166> findByStatus(String status);
    List<GenEntity166> findByType(String type);
    List<GenEntity166> findByIsActiveTrue();
}
