package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity222;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity222Repository extends JpaRepository<GenEntity222, UUID> {
    List<GenEntity222> findByName(String name);
    List<GenEntity222> findByStatus(String status);
    List<GenEntity222> findByType(String type);
    List<GenEntity222> findByIsActiveTrue();
}
