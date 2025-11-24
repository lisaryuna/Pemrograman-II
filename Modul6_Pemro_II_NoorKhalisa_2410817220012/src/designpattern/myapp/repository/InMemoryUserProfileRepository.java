package designpattern.myapp.repository;

import designpattern.myapp.model.UserProfile;

public class InMemoryUserProfileRepository implements UserProfileRepository {
    private UserProfile userProfile;

    @Override
    public void save(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    @Override
    public UserProfile getUserProfile() {
        return this.userProfile;
    }
}
