package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity128;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity128Repository extends JpaRepository<GenEntity128, UUID> {
    List<GenEntity128> findByName(String name);
    List<GenEntity128> findByStatus(String status);
    List<GenEntity128> findByType(String type);
    List<GenEntity128> findByIsActiveTrue();
}
