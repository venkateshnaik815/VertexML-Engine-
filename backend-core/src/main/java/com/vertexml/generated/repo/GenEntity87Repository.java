package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity87;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity87Repository extends JpaRepository<GenEntity87, UUID> {
    List<GenEntity87> findByName(String name);
    List<GenEntity87> findByStatus(String status);
    List<GenEntity87> findByType(String type);
    List<GenEntity87> findByIsActiveTrue();
}
