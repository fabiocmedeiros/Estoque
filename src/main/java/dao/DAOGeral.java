package dao;

import java.util.ArrayList;

public interface DAOGeral <Objeto>{
	public void cadastrar(Objeto objeto);
	public Objeto buscar(String nomeObjeto);
	public ArrayList<Objeto> listar();
	public void deletar(Objeto objeto);
}
