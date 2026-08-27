package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity282;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity282Repository extends JpaRepository<GenEntity282, UUID> {
    List<GenEntity282> findByName(String name);
    List<GenEntity282> findByStatus(String status);
    List<GenEntity282> findByType(String type);
    List<GenEntity282> findByIsActiveTrue();
}
