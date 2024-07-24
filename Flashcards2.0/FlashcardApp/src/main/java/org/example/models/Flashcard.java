package org.example.models;

import java.util.Objects;

public class Flashcard {

    //fields

   private String question;
    private String answer;
   private User author;


    //constructors
    public Flashcard() {
    }

    public Flashcard(String question, String answer, User author) {
        this.question = question;
        this.answer = answer;
        this.author = author;
    }


    //getters and setters

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    //helper methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flashcard flashcard = (Flashcard) o;
        return Objects.equals(question, flashcard.question) && Objects.equals(answer, flashcard.answer) && Objects.equals(author, flashcard.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(question, answer, author);
    }

    @Override
    public String toString() {
        return "Flashcard{" +
                "question='" + question + '\n' +
                ", answer='" + answer + '\'' +
                ", author=" + author +
                '}';
    }


}
