package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity224;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity224Repository extends JpaRepository<GenEntity224, UUID> {
    List<GenEntity224> findByName(String name);
    List<GenEntity224> findByStatus(String status);
    List<GenEntity224> findByType(String type);
    List<GenEntity224> findByIsActiveTrue();
}
