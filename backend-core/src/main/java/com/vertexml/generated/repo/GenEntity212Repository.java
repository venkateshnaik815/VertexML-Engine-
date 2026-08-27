package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity212;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity212Repository extends JpaRepository<GenEntity212, UUID> {
    List<GenEntity212> findByName(String name);
    List<GenEntity212> findByStatus(String status);
    List<GenEntity212> findByType(String type);
    List<GenEntity212> findByIsActiveTrue();
}
