package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity100;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity100Repository extends JpaRepository<GenEntity100, UUID> {
    List<GenEntity100> findByName(String name);
    List<GenEntity100> findByStatus(String status);
    List<GenEntity100> findByType(String type);
    List<GenEntity100> findByIsActiveTrue();
}
