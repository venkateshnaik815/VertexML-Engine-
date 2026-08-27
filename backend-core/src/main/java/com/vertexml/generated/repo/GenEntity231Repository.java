package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity231;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity231Repository extends JpaRepository<GenEntity231, UUID> {
    List<GenEntity231> findByName(String name);
    List<GenEntity231> findByStatus(String status);
    List<GenEntity231> findByType(String type);
    List<GenEntity231> findByIsActiveTrue();
}
