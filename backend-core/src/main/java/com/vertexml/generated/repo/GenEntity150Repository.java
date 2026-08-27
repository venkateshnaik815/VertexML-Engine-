package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity150;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity150Repository extends JpaRepository<GenEntity150, UUID> {
    List<GenEntity150> findByName(String name);
    List<GenEntity150> findByStatus(String status);
    List<GenEntity150> findByType(String type);
    List<GenEntity150> findByIsActiveTrue();
}
