package com.echeverri.apimogodb.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

import com.echeverri.apimogodb.model.Prenda;
import com.echeverri.apimogodb.repository.PrendaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PrendaService implements IPrendaService{
	
	private final PrendaRepository prendaRepository;
	
	public void save(Prenda prenda) {
		if(prenda.getId()== null || prenda.getId().isEmpty()) {
			throw new IllegalArgumentException("El ID de la prenda no puede estar vacío");
		}
		if(prenda.getId()!= null && prendaRepository.existsById(prenda.getId())) {
			throw new IllegalArgumentException("El ID de la prenda ya existe en la base de datos");
		}
		if(prenda.getTipoDePrenda()== null || prenda.getTipoDePrenda().isEmpty()) {
			throw new IllegalArgumentException("El tipo de prenda no puede estar vacío");
		}
		if(prenda.getMarca()== null || prenda.getMarca().isEmpty()) {
			throw new IllegalArgumentException("La marca de la prenda no puede estar vacía");
		}
		if(prenda.getColor()== null || prenda.getColor().isEmpty()) {
			throw new IllegalArgumentException("El color de la prenda no puede estar vacío");
		}
		if(prenda.getTalla()== null || prenda.getTalla().isEmpty()) {
			throw new IllegalArgumentException("La talla de la prenda no puede estar vacía");
		}
		if(prenda.getMaterial()== null || prenda.getMaterial().isEmpty()) {
			throw new IllegalArgumentException("El material de la prenda no puede estar vacío");
		}
		if(prenda.getPrecio() <= 0 ) {
			throw new IllegalArgumentException("El precio de la prenda debe ser mayor que cero");
		}
		prendaRepository.save(prenda);
	}
	
	public Prenda update(Prenda prenda) {
		if(prenda.getId() == null || !prendaRepository.existsById(prenda.getId()) ) {
			throw new IllegalArgumentException("La prenda no existe en la base de datos");
		}
		if(prenda.getTipoDePrenda()== null || prenda.getTipoDePrenda().isEmpty()) {
			throw new IllegalArgumentException("El tipo de prenda no puede estar vacío");
		}
		if(prenda.getMarca()== null || prenda.getMarca().isEmpty()) {
			throw new IllegalArgumentException("La marca de la prenda no puede estar vacía");
		}
		if(prenda.getColor()== null || prenda.getColor().isEmpty()) {
			throw new IllegalArgumentException("El color de la prenda no puede estar vacío");
		}
		if(prenda.getTalla()== null || prenda.getTalla().isEmpty()) {
			throw new IllegalArgumentException("La talla de la prenda no puede estar vacía");
		}
		if(prenda.getMaterial()== null || prenda.getMaterial().isEmpty()) {
			throw new IllegalArgumentException("El material de la prenda no puede estar vacío");
		}
		if(prenda.getPrecio() <= 0 ) {
			throw new IllegalArgumentException("El precio de la prenda debe ser mayor que cero");
		}
		
		return prendaRepository.save(prenda);
	}
	
	public Prenda patch(String id, Prenda prenda) {
		Prenda prendaUpdate = findById(id).get();
		if (prendaUpdate.getId().equals(id)) {
			if	(prenda.getTipoDePrenda()!= null || !prenda.getTipoDePrenda().isEmpty()) {
				prendaUpdate.setTipoDePrenda(prenda.getTipoDePrenda());
			}else {
				throw new IllegalArgumentException("El tipo de prenda no puede estar vacío");
			}
			if	(prenda.getMarca() != null || !prenda.getMarca().isEmpty()) {
	            prendaUpdate.setMarca(prenda.getMarca());
	        }else {
	        	throw new IllegalArgumentException("La marca de la prenda no puede estar vacía");
	        }
			if (prenda.getColor() != null || !prenda.getColor().isEmpty()) {
	            prendaUpdate.setColor(prenda.getColor());
	        }else {
	        	throw new IllegalArgumentException("El color de la prenda no puede estar vacío");
	        }
			if (prenda.getTalla() != null || !prenda.getTalla().isEmpty()) {
	            prendaUpdate.setTalla(prenda.getTalla());
	        }
			else {
				throw new IllegalArgumentException("La talla de la prenda no puede estar vacía");
			}
			if (prenda.getMaterial() != null || !prenda.getMaterial().isEmpty()) {
	            prendaUpdate.setMaterial(prenda.getMaterial());
	        }
			else {
				throw new IllegalArgumentException("El material de la prenda no puede estar vacío");
			}
			if (prenda.getPrecio() > 0) {
	            prendaUpdate.setPrecio(prenda.getPrecio());
	        }else {
	        	throw new IllegalArgumentException("El precio de la prenda debe ser mayor que cero");
	        }
			return prendaRepository.save(prendaUpdate);
		}
		return null;
	}
	
	public List<Prenda> findAll(){
		return prendaRepository.findAll();
	}
	
	public Optional<Prenda> findById(String id) {
		
		Optional<Prenda> prendaOptional = prendaRepository.findById(id);
		if(!prendaOptional.isPresent()) {
			throw new NoSuchElementException("No se encontró ninguna prenda con el ID proporcionado: " + id);
		}
		return prendaOptional;
		
	}
	
	public void deleteById(String id) {
		Optional<Prenda> prendaOptional = prendaRepository.findById(id);
		if(!prendaOptional.isPresent()) {
			throw new NoSuchElementException("No se puede eliminar ninguna prenda ya que el ID proporcionado no existe: " + id);
		}
		prendaRepository.deleteById(id);
	}

	public boolean existById(String id) {
		Optional<Prenda> prendaOptional = prendaRepository.findById(id);
		if(!prendaOptional.isPresent()) {
			throw new NoSuchElementException("No existe ninguna prenda con ese id: " + id);
		}
		return prendaRepository.existsById(id);
	}

	public String optionsPrenda() {
	    StringBuilder responseBuilder = new StringBuilder();
	    responseBuilder.append("Allow: GET, POST, DELETE, PATCH, PUT, HEAD, OPTIONS\n");
	    responseBuilder.append("Access-Control-Allow-Methods: GET, POST, DELETE, PATCH, PUT, HEAD, OPTIONS");
	    return responseBuilder.toString();
	}
}
