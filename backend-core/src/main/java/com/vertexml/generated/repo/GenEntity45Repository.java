package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity45;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity45Repository extends JpaRepository<GenEntity45, UUID> {
    List<GenEntity45> findByName(String name);
    List<GenEntity45> findByStatus(String status);
    List<GenEntity45> findByType(String type);
    List<GenEntity45> findByIsActiveTrue();
}
