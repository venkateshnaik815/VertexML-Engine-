package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity249;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity249Repository extends JpaRepository<GenEntity249, UUID> {
    List<GenEntity249> findByName(String name);
    List<GenEntity249> findByStatus(String status);
    List<GenEntity249> findByType(String type);
    List<GenEntity249> findByIsActiveTrue();
}
