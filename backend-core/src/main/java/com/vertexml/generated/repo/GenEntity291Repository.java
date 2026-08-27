package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity291;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity291Repository extends JpaRepository<GenEntity291, UUID> {
    List<GenEntity291> findByName(String name);
    List<GenEntity291> findByStatus(String status);
    List<GenEntity291> findByType(String type);
    List<GenEntity291> findByIsActiveTrue();
}
