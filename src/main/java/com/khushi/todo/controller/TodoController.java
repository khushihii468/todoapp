package com.khushi.todo.controller;

import com.khushi.todo.model.Todo;
import com.khushi.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/todos")
public class TodoController {
    @Autowired
    private TodoRepository todoRepo;

    @GetMapping
    public List<Todo> getTodos(@RequestParam Long userId) {
        return todoRepo.findByUserId(userId);
    }

    @PostMapping
    public Todo create(@RequestBody Todo todo) {
        return todoRepo.save(todo);
    }

    @PutMapping("/{id}")
    public Todo update(@PathVariable Long id, @RequestBody Todo t) {
        t.setId(id);
        return todoRepo.save(t);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        todoRepo.deleteById(id);
    }
}
