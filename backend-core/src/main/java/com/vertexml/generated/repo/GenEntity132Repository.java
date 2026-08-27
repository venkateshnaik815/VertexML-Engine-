package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity132;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity132Repository extends JpaRepository<GenEntity132, UUID> {
    List<GenEntity132> findByName(String name);
    List<GenEntity132> findByStatus(String status);
    List<GenEntity132> findByType(String type);
    List<GenEntity132> findByIsActiveTrue();
}
