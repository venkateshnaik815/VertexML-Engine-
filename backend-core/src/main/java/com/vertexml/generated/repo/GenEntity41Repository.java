package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity41;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity41Repository extends JpaRepository<GenEntity41, UUID> {
    List<GenEntity41> findByName(String name);
    List<GenEntity41> findByStatus(String status);
    List<GenEntity41> findByType(String type);
    List<GenEntity41> findByIsActiveTrue();
}
