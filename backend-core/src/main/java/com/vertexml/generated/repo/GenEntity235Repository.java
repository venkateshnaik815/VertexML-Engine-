package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity235;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity235Repository extends JpaRepository<GenEntity235, UUID> {
    List<GenEntity235> findByName(String name);
    List<GenEntity235> findByStatus(String status);
    List<GenEntity235> findByType(String type);
    List<GenEntity235> findByIsActiveTrue();
}
