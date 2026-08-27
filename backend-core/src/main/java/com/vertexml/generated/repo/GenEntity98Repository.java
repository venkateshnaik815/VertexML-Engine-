package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity98;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity98Repository extends JpaRepository<GenEntity98, UUID> {
    List<GenEntity98> findByName(String name);
    List<GenEntity98> findByStatus(String status);
    List<GenEntity98> findByType(String type);
    List<GenEntity98> findByIsActiveTrue();
}
