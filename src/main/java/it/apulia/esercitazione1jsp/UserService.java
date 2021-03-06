package it.apulia.esercitazione1jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

	private final UserRepository userRepository;

	@Autowired
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;

	}

	public boolean verifyEmail(String email) {
		return this.userRepository.findUtenteByEmail(email).isPresent();
	}

	public boolean saveUser(UtenteDTO utente) {
		if(!this.verifyEmail(utente.getEmail())){
			Utente temp = new Utente(utente.nome,utente.cognome,utente.email,utente.password);
			this.userRepository.save(temp);
			return true;
		}
		return false; //c'è già un utente
	}

	public boolean verifyPasswordUtente(LoginDTO loginDTO) {
		//controlla che l'utente sia presente all'interno della hashmap
		if(this.verifyEmail(loginDTO.getEmail()))
		{
			//verifica che le password siano uguali
			//if(this.similDB.get(loginDTO.getEmail()).getPassword().equals(loginDTO.getPassword()))
			if(this.userRepository.findUtenteByEmail(loginDTO.getEmail()).get().getPassword().equals(loginDTO.getPassword()))
			{
				return true;
			}
			return false; //password errata
		}
		return false; //l'utente non è presente all'interno del sistema
	}

	public List<Utente> getAllUsers(){
		return this.userRepository.findAll();
	}


	/**
	 * verifica, al momento della registrazione, che le password siano equivalenti
	 * @param psw è il primo campo, quello che verrà poi salvato
	 * @param vpsw è il secondo campo, che viene confrontato con il primo
	 * @return ritorna un booleano che indica se le password siano uguali o meno
	 */
	public boolean verificaPassword(String psw, String vpsw) {
		return psw.equals(vpsw);
	}

}
