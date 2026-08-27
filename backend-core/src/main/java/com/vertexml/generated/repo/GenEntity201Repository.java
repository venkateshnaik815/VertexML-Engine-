package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity201;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity201Repository extends JpaRepository<GenEntity201, UUID> {
    List<GenEntity201> findByName(String name);
    List<GenEntity201> findByStatus(String status);
    List<GenEntity201> findByType(String type);
    List<GenEntity201> findByIsActiveTrue();
}
