package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity64;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity64Repository extends JpaRepository<GenEntity64, UUID> {
    List<GenEntity64> findByName(String name);
    List<GenEntity64> findByStatus(String status);
    List<GenEntity64> findByType(String type);
    List<GenEntity64> findByIsActiveTrue();
}
