package userApp.service;

import userApp.entity.Subscription;
import lombok.RequiredArgsConstructor;
import org.apache.commons.collections4.IterableUtils;
import org.springframework.stereotype.Service;
import userApp.repository.SubscriptionsRepository;

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
