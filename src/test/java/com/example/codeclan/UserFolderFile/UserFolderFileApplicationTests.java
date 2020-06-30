package com.example.codeclan.UserFolderFile;

import com.example.codeclan.UserFolderFile.models.User;
import com.example.codeclan.UserFolderFile.respositories.IFileRepository;
import com.example.codeclan.UserFolderFile.respositories.IFolderRepository;
import com.example.codeclan.UserFolderFile.respositories.IUserRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class UserFolderFileApplicationTests {

@Autowired
	IUserRepository userRepository;

@Autowired
	IFolderRepository folderRepository;

@Autowired
	IFileRepository fileRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createUserAndFolder(){
		User user1 = new User("Timmy");
		userRepository.save(user1);
	}
}
