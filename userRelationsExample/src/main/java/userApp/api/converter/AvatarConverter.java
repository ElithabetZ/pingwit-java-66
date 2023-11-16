package userApp.api.converter;

import userApp.dto.AvatarDto;
import userApp.entity.Avatar;
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
