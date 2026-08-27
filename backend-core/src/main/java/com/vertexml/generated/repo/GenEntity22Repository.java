package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity22;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity22Repository extends JpaRepository<GenEntity22, UUID> {
    List<GenEntity22> findByName(String name);
    List<GenEntity22> findByStatus(String status);
    List<GenEntity22> findByType(String type);
    List<GenEntity22> findByIsActiveTrue();
}
