package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity195;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity195Repository extends JpaRepository<GenEntity195, UUID> {
    List<GenEntity195> findByName(String name);
    List<GenEntity195> findByStatus(String status);
    List<GenEntity195> findByType(String type);
    List<GenEntity195> findByIsActiveTrue();
}
