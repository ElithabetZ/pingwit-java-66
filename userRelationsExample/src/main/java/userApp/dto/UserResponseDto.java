package userApp.dto;

import java.util.List;

public record UserResponseDto(long id, String login, AvatarDto avatar, List<SubscriptionDto> subscriptions, List<CommentDto> comments) {
}
