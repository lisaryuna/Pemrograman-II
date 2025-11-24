package designpattern.myapp.repository;

import designpattern.myapp.model.UserProfile;

public interface UserProfileRepository {
    void save(UserProfile userProfile);
    UserProfile getUserProfile();
}
