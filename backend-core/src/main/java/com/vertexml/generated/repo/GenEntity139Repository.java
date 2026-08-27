package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity139;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity139Repository extends JpaRepository<GenEntity139, UUID> {
    List<GenEntity139> findByName(String name);
    List<GenEntity139> findByStatus(String status);
    List<GenEntity139> findByType(String type);
    List<GenEntity139> findByIsActiveTrue();
}
