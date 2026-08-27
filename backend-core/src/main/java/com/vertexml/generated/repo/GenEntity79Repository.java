package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity79;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity79Repository extends JpaRepository<GenEntity79, UUID> {
    List<GenEntity79> findByName(String name);
    List<GenEntity79> findByStatus(String status);
    List<GenEntity79> findByType(String type);
    List<GenEntity79> findByIsActiveTrue();
}
