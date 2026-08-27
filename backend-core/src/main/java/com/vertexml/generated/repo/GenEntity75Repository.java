package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity75;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity75Repository extends JpaRepository<GenEntity75, UUID> {
    List<GenEntity75> findByName(String name);
    List<GenEntity75> findByStatus(String status);
    List<GenEntity75> findByType(String type);
    List<GenEntity75> findByIsActiveTrue();
}
