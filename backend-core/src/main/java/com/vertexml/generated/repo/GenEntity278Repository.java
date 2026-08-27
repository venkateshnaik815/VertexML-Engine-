package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity278;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity278Repository extends JpaRepository<GenEntity278, UUID> {
    List<GenEntity278> findByName(String name);
    List<GenEntity278> findByStatus(String status);
    List<GenEntity278> findByType(String type);
    List<GenEntity278> findByIsActiveTrue();
}
