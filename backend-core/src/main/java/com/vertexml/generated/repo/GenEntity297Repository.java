package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity297;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity297Repository extends JpaRepository<GenEntity297, UUID> {
    List<GenEntity297> findByName(String name);
    List<GenEntity297> findByStatus(String status);
    List<GenEntity297> findByType(String type);
    List<GenEntity297> findByIsActiveTrue();
}
