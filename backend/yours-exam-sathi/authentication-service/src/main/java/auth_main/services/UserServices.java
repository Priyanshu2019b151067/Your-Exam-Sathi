package auth_main.services;

import auth_main.dtos.SignupRequest;

public abstract class UserServices {
	public abstract void registerNewUser(SignupRequest signUpRequest);
}
