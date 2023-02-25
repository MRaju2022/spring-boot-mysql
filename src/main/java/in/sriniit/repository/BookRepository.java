package in.sriniit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sriniit.binding.Book;

public interface BookRepository extends JpaRepository<Book, Serializable> {

}
