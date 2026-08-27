package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity220;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity220Repository extends JpaRepository<GenEntity220, UUID> {
    List<GenEntity220> findByName(String name);
    List<GenEntity220> findByStatus(String status);
    List<GenEntity220> findByType(String type);
    List<GenEntity220> findByIsActiveTrue();
}
