package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity151;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity151Repository extends JpaRepository<GenEntity151, UUID> {
    List<GenEntity151> findByName(String name);
    List<GenEntity151> findByStatus(String status);
    List<GenEntity151> findByType(String type);
    List<GenEntity151> findByIsActiveTrue();
}
