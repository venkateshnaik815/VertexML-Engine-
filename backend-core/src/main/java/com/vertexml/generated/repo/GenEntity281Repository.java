package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity281;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity281Repository extends JpaRepository<GenEntity281, UUID> {
    List<GenEntity281> findByName(String name);
    List<GenEntity281> findByStatus(String status);
    List<GenEntity281> findByType(String type);
    List<GenEntity281> findByIsActiveTrue();
}
