package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity7;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity7Repository extends JpaRepository<GenEntity7, UUID> {
    List<GenEntity7> findByName(String name);
    List<GenEntity7> findByStatus(String status);
    List<GenEntity7> findByType(String type);
    List<GenEntity7> findByIsActiveTrue();
}
