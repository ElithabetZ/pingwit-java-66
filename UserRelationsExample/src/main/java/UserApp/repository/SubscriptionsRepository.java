package UserApp.repository;

import UserApp.entity.Subscription;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SubscriptionsRepository extends PagingAndSortingRepository<Subscription, Long> {
}
