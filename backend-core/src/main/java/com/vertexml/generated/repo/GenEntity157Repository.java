package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity157;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity157Repository extends JpaRepository<GenEntity157, UUID> {
    List<GenEntity157> findByName(String name);
    List<GenEntity157> findByStatus(String status);
    List<GenEntity157> findByType(String type);
    List<GenEntity157> findByIsActiveTrue();
}
