package com.felipegonzales.movieflix.dto;

import com.felipegonzales.movieflix.services.validation.UserUpdateValid;

@UserUpdateValid // Vai verificar se o email que eu estou inserindo já existe no banco
public class UserUpdateDTO extends UserDTO {

	private static final long serialVersionUID = 1L;

}
