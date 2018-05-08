package com.beini.jwt.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.beini.jwt.entity.User;
import com.beini.jwt.exception.UsernameIsExitedException;
import com.beini.jwt.repository.UserRepository;

/**
 * @author lb_chen
 */
@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	/**
	 * 获取用户列表
	 * 
	 * @return
	 */
	@GetMapping("/userList")
	public Map<String, Object> userList() {
		List<User> users = userRepository.findAll();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("users", users);
		return map;
	}

	/**
	 * 注册用户 默认开启白名单
	 * 
	 * @param user
	 */
	@PostMapping("/signup")
	public User signup(User user) {
		User bizUser = userRepository.findByUsername(user.getUsername());
		if (null != bizUser) {
			throw new UsernameIsExitedException("用户已经存在");
		}
		user.setPassword(DigestUtils.md5DigestAsHex((user.getPassword()).getBytes()));
		return userRepository.save(user);
	}

}
