package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity3;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity3Repository extends JpaRepository<GenEntity3, UUID> {
    List<GenEntity3> findByName(String name);
    List<GenEntity3> findByStatus(String status);
    List<GenEntity3> findByType(String type);
    List<GenEntity3> findByIsActiveTrue();
}
