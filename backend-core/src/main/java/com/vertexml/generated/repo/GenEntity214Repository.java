package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity214;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity214Repository extends JpaRepository<GenEntity214, UUID> {
    List<GenEntity214> findByName(String name);
    List<GenEntity214> findByStatus(String status);
    List<GenEntity214> findByType(String type);
    List<GenEntity214> findByIsActiveTrue();
}
