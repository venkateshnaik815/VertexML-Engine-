package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity268;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity268Repository extends JpaRepository<GenEntity268, UUID> {
    List<GenEntity268> findByName(String name);
    List<GenEntity268> findByStatus(String status);
    List<GenEntity268> findByType(String type);
    List<GenEntity268> findByIsActiveTrue();
}
