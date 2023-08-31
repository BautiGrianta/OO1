package ar.edu.unlp.oo1.ejercicio1.impl;

import ar.edu.unlp.oo1.ejercicio1.WallPost;

/**
 * Completar esta clase de acuerdo a lo especificado en el cuadernillo
 *
 */
public class WallPostImpl implements WallPost {
	private int like;
	private String descr;
	private boolean destacado;
	
	public WallPostImpl() {
		like = 0;
		descr = "Undefined post";
		destacado = false;
	}
	/**
	 * Complete con su implementación
	 */
	public String getText() {
		return descr;
	}
	public void setText(String text) {
		descr = text;
	}
	public int getLikes() {
		return like;
	}
	public void like() {
		like += 1;
	}
	public void dislike() {
		if (like > 0)
			like -= 1;
	}
	public boolean isFeatured() {
		return destacado;
	}
	public void toggleFeatured() {
		destacado = !destacado;
	}
	
	/*
	 * Este mensaje se utiliza para que una instancia de Wallpost se muestre de forma adecuada
	 */
    @Override
    public String toString() {
        return "WallPost {" +
            "text: " + getText() +
            ", likes: '" + getLikes() + "'" +
            ", featured: '" + isFeatured() + "'" +
            "}";
    }

}
