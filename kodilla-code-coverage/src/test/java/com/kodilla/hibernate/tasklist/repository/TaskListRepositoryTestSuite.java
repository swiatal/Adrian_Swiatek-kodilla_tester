package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListRepositoryTestSuite {
    @Autowired
    private TaskListRepository taskListRepository;
    private static final String LISTNAME = "To Do";
    private static final String DESCRIPTION = "Things To Do";

    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        taskListRepository.save(taskList);
        String listName = taskList.getListName();
        //When
        List<TaskList> readListName = taskListRepository.findByListName(listName);
        //Then
        assertEquals(1,readListName.size());
        //CleanUp
        taskListRepository.deleteAll();
    }
}
