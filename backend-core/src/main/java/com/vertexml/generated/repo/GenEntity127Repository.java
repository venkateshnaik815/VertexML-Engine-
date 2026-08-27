package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity127;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity127Repository extends JpaRepository<GenEntity127, UUID> {
    List<GenEntity127> findByName(String name);
    List<GenEntity127> findByStatus(String status);
    List<GenEntity127> findByType(String type);
    List<GenEntity127> findByIsActiveTrue();
}
