package UserApp.api.converter;

import UserApp.dto.UserRequestDto;
import UserApp.dto.UserResponseDto;
import UserApp.entity.Comment;
import UserApp.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import UserApp.service.CommentService;
import UserApp.service.SubscriptionService;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class UserConverter {

    private final SubscriptionService subscriptionService;
    private final CommentService commentService;
    private final AvatarConverter avatarConverter;
    private final SubscriptionConverter subscriptionConverter;
    private final CommentConverter commentConverter;
    public User toModel(UserRequestDto dto){
        User user = new User();
        user.setId(dto.id());
        user.setLogin(dto.login());
        user.setAvatar(dto.avatar());
        user.setSubscriptions(subscriptionService.findAllById(dto.subscriptions()));
        List<Comment> comments = commentService.findAllById(dto.comments());
        comments.forEach(comment -> comment.setUser(user));
        user.setComments(comments);

        return user;
    }

    public UserResponseDto toDto(User user){
        return new UserResponseDto(
                user.getId(),
                user.getLogin(),
                avatarConverter.toDto(user.getAvatar()),
                user.getSubscriptions().stream().map(subscriptionConverter::toDto).collect(Collectors.toList()),
                user.getComments().stream().map(commentConverter::toDto).collect(Collectors.toList())
        );
    }
}
