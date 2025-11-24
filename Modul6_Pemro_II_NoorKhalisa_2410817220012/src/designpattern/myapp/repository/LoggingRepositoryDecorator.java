package designpattern.myapp.repository;

import designpattern.myapp.model.UserProfile;

public class LoggingRepositoryDecorator implements UserProfileRepository {

    private UserProfileRepository wrappedRepository;
    public LoggingRepositoryDecorator(UserProfileRepository repository) {
        this.wrappedRepository = repository;
    }

    @Override
    public void save(UserProfile userProfile) {
        System.out.println("LOG: Menyimpan data user " + userProfile.getName());
        this.wrappedRepository.save(userProfile);
        System.out.println("LOG: Data berhasil disimpan.");
    }

    @Override
    public UserProfile getUserProfile() {
        System.out.println("LOG: Mengambil data user dari memori...");
        return this.wrappedRepository.getUserProfile();
    }
}
