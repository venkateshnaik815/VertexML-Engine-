package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity265;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity265Repository extends JpaRepository<GenEntity265, UUID> {
    List<GenEntity265> findByName(String name);
    List<GenEntity265> findByStatus(String status);
    List<GenEntity265> findByType(String type);
    List<GenEntity265> findByIsActiveTrue();
}
