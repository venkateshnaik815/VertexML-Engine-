package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity104;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity104Repository extends JpaRepository<GenEntity104, UUID> {
    List<GenEntity104> findByName(String name);
    List<GenEntity104> findByStatus(String status);
    List<GenEntity104> findByType(String type);
    List<GenEntity104> findByIsActiveTrue();
}
