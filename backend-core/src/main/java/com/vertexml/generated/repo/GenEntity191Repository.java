package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity191;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity191Repository extends JpaRepository<GenEntity191, UUID> {
    List<GenEntity191> findByName(String name);
    List<GenEntity191> findByStatus(String status);
    List<GenEntity191> findByType(String type);
    List<GenEntity191> findByIsActiveTrue();
}
