package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity84;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity84Repository extends JpaRepository<GenEntity84, UUID> {
    List<GenEntity84> findByName(String name);
    List<GenEntity84> findByStatus(String status);
    List<GenEntity84> findByType(String type);
    List<GenEntity84> findByIsActiveTrue();
}
