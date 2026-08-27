package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity171;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity171Repository extends JpaRepository<GenEntity171, UUID> {
    List<GenEntity171> findByName(String name);
    List<GenEntity171> findByStatus(String status);
    List<GenEntity171> findByType(String type);
    List<GenEntity171> findByIsActiveTrue();
}
