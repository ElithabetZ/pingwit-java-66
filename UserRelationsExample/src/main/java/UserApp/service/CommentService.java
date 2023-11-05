package UserApp.service;

import UserApp.entity.Comment;
import lombok.RequiredArgsConstructor;
import org.apache.commons.collections4.IterableUtils;
import org.springframework.stereotype.Service;
import UserApp.repository.CommentRepository;

import java.util.Collection;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository commentRepository;

    public List<Comment> findAllById(Collection<Long> ids){
        return IterableUtils.toList(commentRepository.findAllById(ids));
    }
}
