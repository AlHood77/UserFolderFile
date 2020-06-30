package com.example.codeclan.UserFolderFile.respositories;

import com.example.codeclan.UserFolderFile.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFileRepository extends JpaRepository<File, Long> {
}
