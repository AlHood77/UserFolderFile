package com.example.codeclan.UserFolderFile.respositories;

import com.example.codeclan.UserFolderFile.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {
}
