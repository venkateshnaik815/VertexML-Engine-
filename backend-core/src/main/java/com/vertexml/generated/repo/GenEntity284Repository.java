package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity284;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity284Repository extends JpaRepository<GenEntity284, UUID> {
    List<GenEntity284> findByName(String name);
    List<GenEntity284> findByStatus(String status);
    List<GenEntity284> findByType(String type);
    List<GenEntity284> findByIsActiveTrue();
}
