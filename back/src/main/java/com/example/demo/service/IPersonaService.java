package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Persona;

public interface IPersonaService {
	
	List<Persona> listar();
	void insertar(Persona persona);
	void actualizar(Persona persona);
	void eliminar(int id);
	List<Persona> listarPorIdentificacion(String identificacion);
	
}
