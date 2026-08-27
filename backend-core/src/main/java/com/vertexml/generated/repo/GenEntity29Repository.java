package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity29;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity29Repository extends JpaRepository<GenEntity29, UUID> {
    List<GenEntity29> findByName(String name);
    List<GenEntity29> findByStatus(String status);
    List<GenEntity29> findByType(String type);
    List<GenEntity29> findByIsActiveTrue();
}
