package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity178;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity178Repository extends JpaRepository<GenEntity178, UUID> {
    List<GenEntity178> findByName(String name);
    List<GenEntity178> findByStatus(String status);
    List<GenEntity178> findByType(String type);
    List<GenEntity178> findByIsActiveTrue();
}
