package com.example.codeclan.UserFolderFile.respositories;

import com.example.codeclan.UserFolderFile.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFolderRepository extends JpaRepository<Folder, Long> {
}
