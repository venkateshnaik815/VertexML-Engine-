package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity5;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity5Repository extends JpaRepository<EnterpriseBillingEntity5, UUID> {
    List<EnterpriseBillingEntity5> findByName(String name);
    List<EnterpriseBillingEntity5> findByStatus(String status);
    List<EnterpriseBillingEntity5> findByType(String type);
    List<EnterpriseBillingEntity5> findByIsActiveTrue();
}
