package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity280;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity280Repository extends JpaRepository<GenEntity280, UUID> {
    List<GenEntity280> findByName(String name);
    List<GenEntity280> findByStatus(String status);
    List<GenEntity280> findByType(String type);
    List<GenEntity280> findByIsActiveTrue();
}
