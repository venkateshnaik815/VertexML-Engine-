package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity11;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity11Repository extends JpaRepository<GenEntity11, UUID> {
    List<GenEntity11> findByName(String name);
    List<GenEntity11> findByStatus(String status);
    List<GenEntity11> findByType(String type);
    List<GenEntity11> findByIsActiveTrue();
}
