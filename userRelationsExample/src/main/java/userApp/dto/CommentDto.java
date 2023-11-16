package userApp.dto;

import userApp.entity.User;

public record CommentDto(long id, String text, User user) {
}
