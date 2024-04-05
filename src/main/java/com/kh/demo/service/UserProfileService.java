package com.kh.demo.service;

import com.kh.demo.entity.one_to_one.UserProfile;

import java.util.List;

public interface UserProfileService {

    UserProfile createUserProfile(UserProfile userProfile);

    UserProfile updateUserProfile(Long id, UserProfile userProfile);

    UserProfile getUserProfileById(Long id);

    List<UserProfile> getAllUserProfiles();

    String deleteUserProfile(Long id);
}
