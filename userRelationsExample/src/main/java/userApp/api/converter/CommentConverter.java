package userApp.api.converter;

import userApp.dto.CommentDto;
import userApp.entity.Comment;
import org.springframework.stereotype.Component;

@Component
public class CommentConverter {

    public CommentDto toDto(Comment comment){
        return new CommentDto(comment.getId(), comment.getText(), comment.getUser());
    }
}
