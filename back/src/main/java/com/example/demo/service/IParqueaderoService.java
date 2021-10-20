package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Parqueadero;
import com.example.demo.model.ParqueaderoPersona;

public interface IParqueaderoService {

	List<Parqueadero> listar();
	void insertar(Parqueadero parqueadero);
	List<Parqueadero> listarPorEstado();
	List<ParqueaderoPersona> listarParqueaderoConPersona();
	int libres();
	void desocuparParqueadero(int id);
	String asignarParqueadero(ParqueaderoPersona parqueaderoPersona);
	void actualizar(Parqueadero parqueadero);
	void eliminar(int id);
	
}
