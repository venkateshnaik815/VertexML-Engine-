package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity74;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity74Repository extends JpaRepository<GenEntity74, UUID> {
    List<GenEntity74> findByName(String name);
    List<GenEntity74> findByStatus(String status);
    List<GenEntity74> findByType(String type);
    List<GenEntity74> findByIsActiveTrue();
}
