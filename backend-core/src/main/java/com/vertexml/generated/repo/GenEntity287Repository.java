package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity287;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity287Repository extends JpaRepository<GenEntity287, UUID> {
    List<GenEntity287> findByName(String name);
    List<GenEntity287> findByStatus(String status);
    List<GenEntity287> findByType(String type);
    List<GenEntity287> findByIsActiveTrue();
}
