package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity1;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity1Repository extends JpaRepository<GenEntity1, UUID> {
    List<GenEntity1> findByName(String name);
    List<GenEntity1> findByStatus(String status);
    List<GenEntity1> findByType(String type);
    List<GenEntity1> findByIsActiveTrue();
}
