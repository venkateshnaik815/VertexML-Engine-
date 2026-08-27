package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity217;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity217Repository extends JpaRepository<GenEntity217, UUID> {
    List<GenEntity217> findByName(String name);
    List<GenEntity217> findByStatus(String status);
    List<GenEntity217> findByType(String type);
    List<GenEntity217> findByIsActiveTrue();
}
