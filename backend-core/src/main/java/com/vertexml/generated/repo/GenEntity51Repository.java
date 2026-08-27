package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity51;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity51Repository extends JpaRepository<GenEntity51, UUID> {
    List<GenEntity51> findByName(String name);
    List<GenEntity51> findByStatus(String status);
    List<GenEntity51> findByType(String type);
    List<GenEntity51> findByIsActiveTrue();
}
