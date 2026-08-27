package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity85;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity85Repository extends JpaRepository<GenEntity85, UUID> {
    List<GenEntity85> findByName(String name);
    List<GenEntity85> findByStatus(String status);
    List<GenEntity85> findByType(String type);
    List<GenEntity85> findByIsActiveTrue();
}
