package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity181;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity181Repository extends JpaRepository<GenEntity181, UUID> {
    List<GenEntity181> findByName(String name);
    List<GenEntity181> findByStatus(String status);
    List<GenEntity181> findByType(String type);
    List<GenEntity181> findByIsActiveTrue();
}
