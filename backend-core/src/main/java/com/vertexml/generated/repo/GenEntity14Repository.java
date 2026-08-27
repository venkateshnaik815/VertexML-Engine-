package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity14;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity14Repository extends JpaRepository<GenEntity14, UUID> {
    List<GenEntity14> findByName(String name);
    List<GenEntity14> findByStatus(String status);
    List<GenEntity14> findByType(String type);
    List<GenEntity14> findByIsActiveTrue();
}
