package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity186;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity186Repository extends JpaRepository<GenEntity186, UUID> {
    List<GenEntity186> findByName(String name);
    List<GenEntity186> findByStatus(String status);
    List<GenEntity186> findByType(String type);
    List<GenEntity186> findByIsActiveTrue();
}
