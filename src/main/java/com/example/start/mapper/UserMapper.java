package com.example.start.mapper;

import com.example.start.dto.request.UserCreationRequest;
import com.example.start.dto.request.UserUpdateRequest;
import com.example.start.dto.response.UserResponse;
import com.example.start.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);

    UserResponse toUserResponse(User user);

    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}
