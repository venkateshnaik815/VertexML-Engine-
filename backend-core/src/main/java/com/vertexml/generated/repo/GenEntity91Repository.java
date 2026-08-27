package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity91;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity91Repository extends JpaRepository<GenEntity91, UUID> {
    List<GenEntity91> findByName(String name);
    List<GenEntity91> findByStatus(String status);
    List<GenEntity91> findByType(String type);
    List<GenEntity91> findByIsActiveTrue();
}
