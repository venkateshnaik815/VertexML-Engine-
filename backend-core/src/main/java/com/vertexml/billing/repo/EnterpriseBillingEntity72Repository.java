package com.vertexml.billing.repo;
import com.vertexml.billing.domain.EnterpriseBillingEntity72;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface EnterpriseBillingEntity72Repository extends JpaRepository<EnterpriseBillingEntity72, UUID> {
    List<EnterpriseBillingEntity72> findByName(String name);
    List<EnterpriseBillingEntity72> findByStatus(String status);
    List<EnterpriseBillingEntity72> findByType(String type);
    List<EnterpriseBillingEntity72> findByIsActiveTrue();
}
