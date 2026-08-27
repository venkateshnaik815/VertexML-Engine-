package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity123;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity123Repository extends JpaRepository<GenEntity123, UUID> {
    List<GenEntity123> findByName(String name);
    List<GenEntity123> findByStatus(String status);
    List<GenEntity123> findByType(String type);
    List<GenEntity123> findByIsActiveTrue();
}
