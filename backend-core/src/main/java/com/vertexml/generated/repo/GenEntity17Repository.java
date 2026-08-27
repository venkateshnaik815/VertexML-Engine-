package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity17;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity17Repository extends JpaRepository<GenEntity17, UUID> {
    List<GenEntity17> findByName(String name);
    List<GenEntity17> findByStatus(String status);
    List<GenEntity17> findByType(String type);
    List<GenEntity17> findByIsActiveTrue();
}
