package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity273;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity273Repository extends JpaRepository<GenEntity273, UUID> {
    List<GenEntity273> findByName(String name);
    List<GenEntity273> findByStatus(String status);
    List<GenEntity273> findByType(String type);
    List<GenEntity273> findByIsActiveTrue();
}
