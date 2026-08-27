package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity264;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity264Repository extends JpaRepository<GenEntity264, UUID> {
    List<GenEntity264> findByName(String name);
    List<GenEntity264> findByStatus(String status);
    List<GenEntity264> findByType(String type);
    List<GenEntity264> findByIsActiveTrue();
}
