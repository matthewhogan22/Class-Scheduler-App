package com.example.test;

import java.util.ArrayList;

public class AppUser {
    private String username, password;
    private ArrayList<Event> courses, assignments, exams;
    private ArrayList<Task> toDo;

    public AppUser(String u, String p, ArrayList<Event> c, ArrayList<Event> a, ArrayList<Event> e, ArrayList<Task> t) {
        this.username = u;
        this.password = p;
        this.courses = c;
        this.assignments = a;
        this.exams = e;
        this.toDo = t;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Event> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Event> courses) {
        this.courses = courses;
    }

    public ArrayList<Event> getAssignments() {
        return assignments;
    }

    public void setAssignments(ArrayList<Event> assignments) {
        this.assignments = assignments;
    }

    public ArrayList<Event> getExams() {
        return exams;
    }

    public void setExams(ArrayList<Event> exams) {
        this.exams = exams;
    }

    public ArrayList<Task> getToDo() {
        return toDo;
    }

    public void setToDo(ArrayList<Task> toDo) {
        this.toDo = toDo;
    }
}
