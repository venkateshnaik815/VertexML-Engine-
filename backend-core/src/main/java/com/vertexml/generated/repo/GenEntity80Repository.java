package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity80;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity80Repository extends JpaRepository<GenEntity80, UUID> {
    List<GenEntity80> findByName(String name);
    List<GenEntity80> findByStatus(String status);
    List<GenEntity80> findByType(String type);
    List<GenEntity80> findByIsActiveTrue();
}
