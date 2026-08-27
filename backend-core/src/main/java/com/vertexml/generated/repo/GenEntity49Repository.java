package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity49;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity49Repository extends JpaRepository<GenEntity49, UUID> {
    List<GenEntity49> findByName(String name);
    List<GenEntity49> findByStatus(String status);
    List<GenEntity49> findByType(String type);
    List<GenEntity49> findByIsActiveTrue();
}
