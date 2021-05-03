package cl.inacap.zCapModel.dao;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import cl.inacap.zCapModel.dto.Juego;

/**
 * Session Bean implementation class JuegosDAO
 */
@Stateless
@LocalBean
public class JuegosDAO implements JuegosDAOLocal {

    /**
     * Default constructor. 
     */
    public JuegosDAO() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void save(Juego juego) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Juego> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Juego juego) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Juego> filterBYName(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

}
