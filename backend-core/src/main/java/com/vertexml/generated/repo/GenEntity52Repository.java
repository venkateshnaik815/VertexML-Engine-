package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity52;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity52Repository extends JpaRepository<GenEntity52, UUID> {
    List<GenEntity52> findByName(String name);
    List<GenEntity52> findByStatus(String status);
    List<GenEntity52> findByType(String type);
    List<GenEntity52> findByIsActiveTrue();
}
