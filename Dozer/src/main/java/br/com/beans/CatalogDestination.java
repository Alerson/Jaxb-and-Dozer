package br.com.beans;

import java.util.ArrayList;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

public class CatalogDestination {

	private List<CatalogDestination.Book> bookDestination;

	public List<CatalogDestination.Book> getbookDestination() {
		if (bookDestination == null) {
			bookDestination = new ArrayList<CatalogDestination.Book>();
		}
		return this.bookDestination;
	}

	public void setBookDestination(List<CatalogDestination.Book> bookDestination) {
		this.bookDestination = bookDestination;
	}

	public static class Book {

		protected String author;
		protected String title;
		protected String genre;
		protected float price;
		protected XMLGregorianCalendar publishDate;
		protected String description;

		/**
		 * Gets the value of the author property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getAuthor() {
			return author;
		}

		/**
		 * Sets the value of the author property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setAuthor(String value) {
			this.author = value;
		}

		/**
		 * Gets the value of the title property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getTitle() {
			return title;
		}

		/**
		 * Sets the value of the title property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setTitle(String value) {
			this.title = value;
		}

		/**
		 * Gets the value of the genre property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getGenre() {
			return genre;
		}

		/**
		 * Sets the value of the genre property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setGenre(String value) {
			this.genre = value;
		}

		/**
		 * Gets the value of the price property.
		 * 
		 */
		public float getPrice() {
			return price;
		}

		/**
		 * Sets the value of the price property.
		 * 
		 */
		public void setPrice(float value) {
			this.price = value;
		}

		/**
		 * Gets the value of the publishDate property.
		 * 
		 * @return possible object is {@link XMLGregorianCalendar }
		 * 
		 */
		public XMLGregorianCalendar getPublishDate() {
			return publishDate;
		}

		/**
		 * Sets the value of the publishDate property.
		 * 
		 * @param value
		 *            allowed object is {@link XMLGregorianCalendar }
		 * 
		 */
		public void setPublishDate(XMLGregorianCalendar value) {
			this.publishDate = value;
		}

		/**
		 * Gets the value of the description property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDescription() {
			return description;
		}

		/**
		 * Sets the value of the description property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDescription(String value) {
			this.description = value;
		}

	}
}
