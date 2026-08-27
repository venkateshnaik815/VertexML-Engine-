package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity259;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity259Repository extends JpaRepository<GenEntity259, UUID> {
    List<GenEntity259> findByName(String name);
    List<GenEntity259> findByStatus(String status);
    List<GenEntity259> findByType(String type);
    List<GenEntity259> findByIsActiveTrue();
}
