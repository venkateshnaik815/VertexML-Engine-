package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity293;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity293Repository extends JpaRepository<GenEntity293, UUID> {
    List<GenEntity293> findByName(String name);
    List<GenEntity293> findByStatus(String status);
    List<GenEntity293> findByType(String type);
    List<GenEntity293> findByIsActiveTrue();
}
