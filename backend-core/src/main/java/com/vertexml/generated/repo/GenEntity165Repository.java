package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity165;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity165Repository extends JpaRepository<GenEntity165, UUID> {
    List<GenEntity165> findByName(String name);
    List<GenEntity165> findByStatus(String status);
    List<GenEntity165> findByType(String type);
    List<GenEntity165> findByIsActiveTrue();
}
