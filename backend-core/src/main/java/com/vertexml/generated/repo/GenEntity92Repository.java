package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity92;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity92Repository extends JpaRepository<GenEntity92, UUID> {
    List<GenEntity92> findByName(String name);
    List<GenEntity92> findByStatus(String status);
    List<GenEntity92> findByType(String type);
    List<GenEntity92> findByIsActiveTrue();
}
