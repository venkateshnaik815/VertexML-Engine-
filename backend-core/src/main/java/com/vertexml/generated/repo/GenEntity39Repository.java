package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity39;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity39Repository extends JpaRepository<GenEntity39, UUID> {
    List<GenEntity39> findByName(String name);
    List<GenEntity39> findByStatus(String status);
    List<GenEntity39> findByType(String type);
    List<GenEntity39> findByIsActiveTrue();
}
