package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity209;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity209Repository extends JpaRepository<GenEntity209, UUID> {
    List<GenEntity209> findByName(String name);
    List<GenEntity209> findByStatus(String status);
    List<GenEntity209> findByType(String type);
    List<GenEntity209> findByIsActiveTrue();
}
