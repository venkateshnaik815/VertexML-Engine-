package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity59;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity59Repository extends JpaRepository<GenEntity59, UUID> {
    List<GenEntity59> findByName(String name);
    List<GenEntity59> findByStatus(String status);
    List<GenEntity59> findByType(String type);
    List<GenEntity59> findByIsActiveTrue();
}
