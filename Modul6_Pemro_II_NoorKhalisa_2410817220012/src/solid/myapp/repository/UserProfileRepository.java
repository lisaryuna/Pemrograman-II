package solid.myapp.repository;

import solid.myapp.model.UserProfile;

public interface UserProfileRepository {
    void save(UserProfile userProfile);
    UserProfile getUserProfile();
}
