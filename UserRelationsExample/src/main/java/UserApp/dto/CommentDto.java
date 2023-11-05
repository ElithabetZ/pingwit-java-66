package UserApp.dto;

import UserApp.entity.User;

public record CommentDto(long id, String text, User user) {
}
