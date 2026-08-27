package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity133;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity133Repository extends JpaRepository<GenEntity133, UUID> {
    List<GenEntity133> findByName(String name);
    List<GenEntity133> findByStatus(String status);
    List<GenEntity133> findByType(String type);
    List<GenEntity133> findByIsActiveTrue();
}
