package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity117;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity117Repository extends JpaRepository<GenEntity117, UUID> {
    List<GenEntity117> findByName(String name);
    List<GenEntity117> findByStatus(String status);
    List<GenEntity117> findByType(String type);
    List<GenEntity117> findByIsActiveTrue();
}
