package com.example.codeclan.UserFolderFile.components;

import com.example.codeclan.UserFolderFile.models.File;
import com.example.codeclan.UserFolderFile.models.Folder;
import com.example.codeclan.UserFolderFile.models.User;
import com.example.codeclan.UserFolderFile.respositories.IFileRepository;
import com.example.codeclan.UserFolderFile.respositories.IFolderRepository;
import com.example.codeclan.UserFolderFile.respositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class DataLoader implements ApplicationRunner {

    @Autowired
    IFileRepository fileRepository;

    @Autowired
    IFolderRepository folderRepository;

    @Autowired
    IUserRepository userRepository;

    public DataLoader(){

    }

    @Override
    public void run(ApplicationArguments args)  {

        User alan = new User("Alan");
        userRepository.save(alan);

        User mark = new User("Mark");
        userRepository.save(mark);

        Folder java = new Folder("Java");
        folderRepository.save(java);

        Folder css = new Folder("CSS");
        folderRepository.save(css);

        File spring = new File("Spring", "pdf", 5);
        fileRepository.save(spring);

        File grid = new File("Grid", "pdf", 4);
        fileRepository.save(grid);

        File flexbox = new File("Flexbox", "pdf", 3);
        fileRepository.save(flexbox);

        alan.addFolder(java);
        userRepository.save(alan);
        mark.addFolder(css);
        userRepository.save(mark);

        css.addFile(grid);
        folderRepository.save(css);
        css.addFile(flexbox);
        folderRepository.save(css);

        java.addFile(spring);
        folderRepository.save(java);
    }
}
