package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity43;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity43Repository extends JpaRepository<GenEntity43, UUID> {
    List<GenEntity43> findByName(String name);
    List<GenEntity43> findByStatus(String status);
    List<GenEntity43> findByType(String type);
    List<GenEntity43> findByIsActiveTrue();
}
