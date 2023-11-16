package userApp.api.converter;

import userApp.dto.AvatarDto;
import userApp.dto.CommentDto;
import userApp.dto.SubscriptionDto;
import userApp.dto.UserResponseDto;
import userApp.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserResponseConvrter {

    private final AvatarConverter avatarConverter;
    private final SubscriptionConverter subscriptionConverter;
    private final CommentConverter commentConverter;

    public UserResponseConvrter(AvatarConverter avatarConverter, SubscriptionConverter subscriptionConverter, CommentConverter commentConverter) {
        this.avatarConverter = avatarConverter;
        this.subscriptionConverter = subscriptionConverter;
        this.commentConverter = commentConverter;
    }

    public UserResponseDto toDto(User user){

        AvatarDto avatarDto = avatarConverter.toDto(user.getAvatar());
        List<SubscriptionDto> subscriptionDtos = user.getSubscriptions().stream().map(subscriptionConverter::toDto).collect(Collectors.toList());
        List<CommentDto> commentDtos = user.getComments().stream().map(commentConverter::toDto).collect(Collectors.toList());

        return new UserResponseDto(
                user.getId(),
                user.getLogin(),
                avatarDto,
                subscriptionDtos,
                commentDtos
        );
    }
}
