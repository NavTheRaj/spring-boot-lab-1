package com.navraj.springbootclass.helper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class EntityListMapper<S, T> {


    @Autowired
    private ModelMapper modelMapper;

    public List<T> map(List<S> pastModelsList,T currentModel) {
        return
                (List<T>) pastModelsList
                        .stream()
                        .map(p -> modelMapper.map(
                                p,
                                currentModel.getClass()))
                        .collect(Collectors.toList());
    }

}
