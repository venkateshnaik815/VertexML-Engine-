package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity33;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity33Repository extends JpaRepository<GenEntity33, UUID> {
    List<GenEntity33> findByName(String name);
    List<GenEntity33> findByStatus(String status);
    List<GenEntity33> findByType(String type);
    List<GenEntity33> findByIsActiveTrue();
}
