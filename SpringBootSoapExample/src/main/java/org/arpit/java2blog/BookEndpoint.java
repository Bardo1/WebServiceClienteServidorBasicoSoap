package org.arpit.java2blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.java2blog.xml.book.GetBookRequest;
import com.java2blog.xml.book.GetBookResponse;

@Endpoint
public class BookEndpoint {
	private static final String NAMESPACE_URI = "http://www.java2blog.com/xml/book";

	private BookRepository bookRepository;

	@Autowired
	public BookEndpoint(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getBookRequest")
	@ResponsePayload
	public GetBookResponse getCountry(@RequestPayload GetBookRequest request) {
		GetBookResponse response = new GetBookResponse();
		response.setBook(bookRepository.findBookById(request.getId()));
		return response;
	}
}