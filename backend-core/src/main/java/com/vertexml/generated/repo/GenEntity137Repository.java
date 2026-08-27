package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity137;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity137Repository extends JpaRepository<GenEntity137, UUID> {
    List<GenEntity137> findByName(String name);
    List<GenEntity137> findByStatus(String status);
    List<GenEntity137> findByType(String type);
    List<GenEntity137> findByIsActiveTrue();
}
