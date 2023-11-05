package UserApp.api.converter;

import UserApp.dto.AvatarDto;
import UserApp.entity.Avatar;
import org.springframework.stereotype.Component;

@Component
public class AvatarConverter {

    public AvatarDto toDto(Avatar avatar){
        return new AvatarDto(avatar.getId(), avatar.getUrl());
    }

    public Avatar toModel(AvatarDto dto){
        return new Avatar(dto.id(), dto.url());
    }
}
