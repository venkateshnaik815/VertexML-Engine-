package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity183;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity183Repository extends JpaRepository<GenEntity183, UUID> {
    List<GenEntity183> findByName(String name);
    List<GenEntity183> findByStatus(String status);
    List<GenEntity183> findByType(String type);
    List<GenEntity183> findByIsActiveTrue();
}
