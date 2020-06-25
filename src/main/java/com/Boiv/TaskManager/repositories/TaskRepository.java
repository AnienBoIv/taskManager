package com.Boiv.TaskManager.repositories;

import com.Boiv.TaskManager.entities.Text;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class TaskRepository {

    private List<Text> textList;

    public List<Text> getTextList() {
        return textList;
    }

    @PostConstruct
    public void init() {
        textList = new ArrayList<>();
        textList.add( new Text(1, "Первый текст") );
        textList.add( new Text(2, "Второй текст") );
        textList.add( new Text(3, "Третий текст") );
        textList.add( new Text(4, "Четвертый текст") );
    }

    public void deleteTextById(int id) {
        for(int i = 0; i < textList.size(); i++){
            if( textList.get(i).getId() == id ) {
                textList.remove(i);
                return;
            }
        }
    }
}
