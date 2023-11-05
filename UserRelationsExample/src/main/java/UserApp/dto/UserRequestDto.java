package UserApp.dto;

import UserApp.entity.Avatar;

import java.util.List;

public record UserRequestDto(long id, String login, Avatar avatar, List<Long> subscriptions, List<Long> comments) {
}
