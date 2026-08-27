package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity182;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity182Repository extends JpaRepository<GenEntity182, UUID> {
    List<GenEntity182> findByName(String name);
    List<GenEntity182> findByStatus(String status);
    List<GenEntity182> findByType(String type);
    List<GenEntity182> findByIsActiveTrue();
}
