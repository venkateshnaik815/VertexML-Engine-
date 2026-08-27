package com.vertexml.generated.repo;
import com.vertexml.generated.domain.GenEntity153;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface GenEntity153Repository extends JpaRepository<GenEntity153, UUID> {
    List<GenEntity153> findByName(String name);
    List<GenEntity153> findByStatus(String status);
    List<GenEntity153> findByType(String type);
    List<GenEntity153> findByIsActiveTrue();
}
