package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity237;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity237Repository extends JpaRepository<GenEntity237, UUID> {
    List<GenEntity237> findByName(String name);
    List<GenEntity237> findByStatus(String status);
    List<GenEntity237> findByType(String type);
    List<GenEntity237> findByIsActiveTrue();
}
