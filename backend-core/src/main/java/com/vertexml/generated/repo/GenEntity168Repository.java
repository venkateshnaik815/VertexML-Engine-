package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity168;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity168Repository extends JpaRepository<GenEntity168, UUID> {
    List<GenEntity168> findByName(String name);
    List<GenEntity168> findByStatus(String status);
    List<GenEntity168> findByType(String type);
    List<GenEntity168> findByIsActiveTrue();
}
