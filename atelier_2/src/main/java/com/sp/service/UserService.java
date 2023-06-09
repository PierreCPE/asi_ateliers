package com.sp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.model.Card;
import com.sp.model.User;
import com.sp.model.UserDTORegister;
import com.sp.mapper.MapperUser;
import com.sp.repository.UserRepository;


@Service
public class UserService {
	
	@Autowired
	UserRepository uRepository;
	
	
	@Autowired
	CardService cardService;
	/**
	 * ajoute un utilsateur à la base de donnée
	 * appelle la fonction permettant de lui générer ses 5 premières cartes
	 * @param userDTORegister
	 * @return l'id de l'utilisateur
	 */
	public int addUser(UserDTORegister userDTO){
		System.out.println(userDTO);
		Optional<User> uOpt =uRepository.findByUserName(userDTO.getUserName());
		System.out.println(uOpt);
		if (!uOpt.isPresent()) {
			User u = MapperUser.UserDTORegisterToUser(userDTO);
			uRepository.save(u);
			System.out.println(u);
			
			attributeCard(u.getId());
			
			return u.getId();
		}
		else {
			return -1;
		}
	
	}
	
	
	public void attributeCard(int id) {
		cardService.getFiveFirstCards(id);
	}
	
	public User getUser(int id) {
		Optional<User> u0pt = uRepository.findById(id);
		if (u0pt.isPresent()) {
			return u0pt.get();
		}
		else {
			return null;
		}
	}
	
	
	public int getSolde(int id_user) {
		Optional<User> uOpt =uRepository.findById(id_user);
		if (uOpt.isPresent()) {
			User u = uOpt.get();
			return u.getSolde();
		}
		else {
			return -1;
		}
	}

	public void updateUser(User u) {
		uRepository.save(u);
	}
}
