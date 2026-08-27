package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity253;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity253Repository extends JpaRepository<GenEntity253, UUID> {
    List<GenEntity253> findByName(String name);
    List<GenEntity253> findByStatus(String status);
    List<GenEntity253> findByType(String type);
    List<GenEntity253> findByIsActiveTrue();
}
