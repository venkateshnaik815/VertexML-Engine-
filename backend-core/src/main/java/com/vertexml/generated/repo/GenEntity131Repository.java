package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity131;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity131Repository extends JpaRepository<GenEntity131, UUID> {
    List<GenEntity131> findByName(String name);
    List<GenEntity131> findByStatus(String status);
    List<GenEntity131> findByType(String type);
    List<GenEntity131> findByIsActiveTrue();
}
