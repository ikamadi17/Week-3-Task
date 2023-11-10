package org.example.services;

import org.example.entities.Book;
import org.example.entities.Person;

import java.util.List;


public interface LibraryService {
    boolean teacherSeniorJuniorPriority(List<Person> teacher, List<Person> seniorStudentList, List<Person> juniorStudentList, Book book) throws RuntimeException;


    void firstComeFirstServed(List<Person> teacher, List<Person> seniorStudentList, List<Person> juniorStudentList, Book book);
}

