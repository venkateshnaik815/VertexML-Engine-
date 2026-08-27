package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity10;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity10Repository extends JpaRepository<GenEntity10, UUID> {
    List<GenEntity10> findByName(String name);
    List<GenEntity10> findByStatus(String status);
    List<GenEntity10> findByType(String type);
    List<GenEntity10> findByIsActiveTrue();
}
