package com.pizzeria.model;

import java.util.List;
import java.util.stream.Collectors;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "pizza")
public class Pizza {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "Il nome non può essere Null")
	@Size(max = 50, message = "Il nome può avere massimo 50 caratteri")
	@Column(nullable = false)
	private String name;

	@NotBlank(message = "La descrizione non può essere Null")
	@Size(max = 255, message = "La descrizione può avere massimo 255 caratteri")
	@Column(nullable = false)
	private String description;

	@Size(max = 255, message = "URL può avere massimo 255 caratteri")
	@Column(name = "photo_url")
	private String photoUrl;

	@NotNull(message = "Il prezzo non può essere Null")
	@DecimalMin(value = "0.0", inclusive = false, message = "Il prezzo deve avere un valore superiore a zero")
	@Column(nullable = false)
	private Double price;

	// Costruttore con argomenti
	public Pizza(String name, String description, String photoUrl, Double price) {
		this.name = name;
		this.description = description;
		this.photoUrl = photoUrl;
		this.price = price;
	}

	// Costruttore senza argomenti
	public Pizza() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pizza [id=" + id + ", name=" + name + ", ingredients=" + ", description=" + description + ", photoUrl="
				+ photoUrl + ", price=" + price + "]";
	}

	// RELAZIONE SPECIAL OFFER FK
	@ManyToOne
	@JoinColumn(name = "special_offer_id")
	private SpecialOffer specialOffer;

	public SpecialOffer getSpecialOffer() {
		return specialOffer;
	}

	public void setSpecialOffer(SpecialOffer specialOffer) {
		this.specialOffer = specialOffer;
	}

	// RELAZIONE INGREDIENTI
	@ManyToMany
	@JoinTable(name = "pizza_ingredienti", joinColumns = @JoinColumn(name = "pizza_id"), inverseJoinColumns = @JoinColumn(name = "ingredienti_id"))
	private List<Ingredienti> ingredienti;

	public List<Ingredienti> getIngredienti() {
		return ingredienti;
	}

	public void setIngredienti(List<Ingredienti> ingredienti) {
		this.ingredienti = ingredienti;
	}

	public String getIngredientiAsString() {
		
		// Verifica se la lista degli ingredienti è vuota o null
		if (ingredienti == null || ingredienti.isEmpty()) {
			return "";
		}

		// Crea una stringa con i nomi degli ingredienti separati da virgole
		String ingredientiString = ingredienti.stream()
				.map(Ingredienti::getName) // Estrai il nome di ogni ingrediente
				.collect(Collectors.joining(", ")); // Unisci i nomi con una virgola e uno spazio

		return ingredientiString;
	}

}
