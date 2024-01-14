package com.demo.todolist;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
@RequestScoped
public class FormToDoListBean {
    private String task;
    private boolean isValid = false;

    @Inject
    private ToDoListBean toDoListBean;

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public void validateAndAddTask(String taskParam) {
        toDoListBean.addTask(taskParam);
        isValid = true;
        // Clear the field
        this.task = "";
    }
}
