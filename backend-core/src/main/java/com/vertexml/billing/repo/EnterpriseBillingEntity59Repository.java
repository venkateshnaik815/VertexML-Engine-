package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity59;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity59Repository extends JpaRepository<EnterpriseBillingEntity59, UUID> {
    List<EnterpriseBillingEntity59> findByName(String name);
    List<EnterpriseBillingEntity59> findByStatus(String status);
    List<EnterpriseBillingEntity59> findByType(String type);
    List<EnterpriseBillingEntity59> findByIsActiveTrue();
}
