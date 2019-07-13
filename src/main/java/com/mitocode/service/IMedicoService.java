package com.mitocode.service;

import java.util.List;

import com.mitocode.model.Medico;
import com.mitocode.model.Paciente;

public interface IMedicoService {
	void registrar(Medico pac);
	void modificar(Medico pac);
	List<Medico>listar();
	Paciente leerPorId(Integer id);
	void eliminar(Integer id);
}

