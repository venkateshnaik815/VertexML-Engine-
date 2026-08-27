package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity240;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity240Repository extends JpaRepository<GenEntity240, UUID> {
    List<GenEntity240> findByName(String name);
    List<GenEntity240> findByStatus(String status);
    List<GenEntity240> findByType(String type);
    List<GenEntity240> findByIsActiveTrue();
}
