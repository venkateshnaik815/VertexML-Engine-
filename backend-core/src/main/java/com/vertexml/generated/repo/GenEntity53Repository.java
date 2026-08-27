package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity53;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity53Repository extends JpaRepository<GenEntity53, UUID> {
    List<GenEntity53> findByName(String name);
    List<GenEntity53> findByStatus(String status);
    List<GenEntity53> findByType(String type);
    List<GenEntity53> findByIsActiveTrue();
}
