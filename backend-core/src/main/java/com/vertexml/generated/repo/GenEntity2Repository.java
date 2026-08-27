package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity2;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity2Repository extends JpaRepository<GenEntity2, UUID> {
    List<GenEntity2> findByName(String name);
    List<GenEntity2> findByStatus(String status);
    List<GenEntity2> findByType(String type);
    List<GenEntity2> findByIsActiveTrue();
}
