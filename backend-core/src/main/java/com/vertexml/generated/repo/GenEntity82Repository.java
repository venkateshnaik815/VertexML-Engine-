package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity82;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity82Repository extends JpaRepository<GenEntity82, UUID> {
    List<GenEntity82> findByName(String name);
    List<GenEntity82> findByStatus(String status);
    List<GenEntity82> findByType(String type);
    List<GenEntity82> findByIsActiveTrue();
}
