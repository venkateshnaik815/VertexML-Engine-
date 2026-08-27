package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity118;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity118Repository extends JpaRepository<GenEntity118, UUID> {
    List<GenEntity118> findByName(String name);
    List<GenEntity118> findByStatus(String status);
    List<GenEntity118> findByType(String type);
    List<GenEntity118> findByIsActiveTrue();
}
