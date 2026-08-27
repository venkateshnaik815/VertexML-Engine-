package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity58;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity58Repository extends JpaRepository<GenEntity58, UUID> {
    List<GenEntity58> findByName(String name);
    List<GenEntity58> findByStatus(String status);
    List<GenEntity58> findByType(String type);
    List<GenEntity58> findByIsActiveTrue();
}
