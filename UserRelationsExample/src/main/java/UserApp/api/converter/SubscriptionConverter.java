package UserApp.api.converter;

import UserApp.dto.SubscriptionDto;
import UserApp.entity.Subscription;
import org.springframework.stereotype.Component;

@Component
public class SubscriptionConverter {

    public SubscriptionDto toDto(Subscription subscription){
        return new SubscriptionDto(subscription.getId(), subscription.getType());
    }
}
