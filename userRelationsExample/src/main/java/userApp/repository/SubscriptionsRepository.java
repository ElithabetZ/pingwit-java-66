package userApp.repository;

import userApp.entity.Subscription;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SubscriptionsRepository extends PagingAndSortingRepository<Subscription, Long> {
}
