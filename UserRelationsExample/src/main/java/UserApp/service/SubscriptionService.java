package UserApp.service;

import UserApp.entity.Subscription;
import lombok.RequiredArgsConstructor;
import org.apache.commons.collections4.IterableUtils;
import org.springframework.stereotype.Service;
import UserApp.repository.SubscriptionsRepository;

import java.util.Collection;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SubscriptionService {

    private final SubscriptionsRepository subscriptionsRepository;

    public List<Subscription> findAllById(Collection<Long> ids){
        return IterableUtils.toList(subscriptionsRepository.findAllById(ids));
    }
}
