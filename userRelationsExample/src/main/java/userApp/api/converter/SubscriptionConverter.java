package userApp.api.converter;

import userApp.dto.SubscriptionDto;
import userApp.entity.Subscription;
import org.springframework.stereotype.Component;

@Component
public class SubscriptionConverter {

    public SubscriptionDto toDto(Subscription subscription){
        return new SubscriptionDto(subscription.getId(), subscription.getType());
    }
}
