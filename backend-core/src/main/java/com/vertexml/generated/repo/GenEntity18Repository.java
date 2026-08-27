package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity18;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity18Repository extends JpaRepository<GenEntity18, UUID> {
    List<GenEntity18> findByName(String name);
    List<GenEntity18> findByStatus(String status);
    List<GenEntity18> findByType(String type);
    List<GenEntity18> findByIsActiveTrue();
}
