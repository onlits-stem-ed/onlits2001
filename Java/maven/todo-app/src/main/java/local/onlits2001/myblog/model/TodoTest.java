package local.onlits2001.myblog.model;

import java.util.ArrayList;

public class TodoTest {
    public static void main(String[] args) {
        // testCreate();
        // testUpdate();
        // testDelete();
        testRead(1);
        testRead(3);
        testRead();
    }

    public static void testCreate() {
        Todo todo = new Todo();
        todo.setDescription("Create a presentation on SQ3R");
        todo.setCompletedStatus(0);
        todo.create();
    }

    public static void testUpdate() {
        Todo todo = new Todo();
        todo.setDescription("Label the books in library");
        todo.setCompletedStatus(0);
        ;
        todo.update(2);
    }

    public static void testDelete() {
        new Todo().delete(2);
    }

    public static void testRead() {
        ArrayList<Todo> todos;
        todos = new Todo().read();
        for (Todo todo : todos) {
            System.out.println(todo.getDescription());
        }
    }

    public static void testRead(int id) {
        ArrayList<Todo> todos;
        todos = new Todo().read(id);
        if (todos.isEmpty()) {
            System.out.println("No data found!");
            return;
        }
        for (Todo todo : todos) {
            System.out.println(todo.getDescription());
        }
    }
}
