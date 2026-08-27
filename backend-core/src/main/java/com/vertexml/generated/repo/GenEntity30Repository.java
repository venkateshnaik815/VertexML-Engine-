package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity30;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity30Repository extends JpaRepository<GenEntity30, UUID> {
    List<GenEntity30> findByName(String name);
    List<GenEntity30> findByStatus(String status);
    List<GenEntity30> findByType(String type);
    List<GenEntity30> findByIsActiveTrue();
}
