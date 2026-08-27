package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity60;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity60Repository extends JpaRepository<GenEntity60, UUID> {
    List<GenEntity60> findByName(String name);
    List<GenEntity60> findByStatus(String status);
    List<GenEntity60> findByType(String type);
    List<GenEntity60> findByIsActiveTrue();
}
