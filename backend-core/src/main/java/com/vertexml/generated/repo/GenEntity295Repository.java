package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity295;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity295Repository extends JpaRepository<GenEntity295, UUID> {
    List<GenEntity295> findByName(String name);
    List<GenEntity295> findByStatus(String status);
    List<GenEntity295> findByType(String type);
    List<GenEntity295> findByIsActiveTrue();
}
