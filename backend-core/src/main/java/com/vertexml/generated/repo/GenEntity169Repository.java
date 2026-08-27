package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity169;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity169Repository extends JpaRepository<GenEntity169, UUID> {
    List<GenEntity169> findByName(String name);
    List<GenEntity169> findByStatus(String status);
    List<GenEntity169> findByType(String type);
    List<GenEntity169> findByIsActiveTrue();
}
