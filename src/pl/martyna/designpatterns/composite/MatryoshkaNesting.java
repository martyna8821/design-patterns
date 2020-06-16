package pl.martyna.designpatterns.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MatryoshkaNesting implements Doll {

    private List<Matryoshka> dolls;

    public MatryoshkaNesting(){
        this.dolls = new ArrayList<>(0);
    }

    public void addDoll(Matryoshka... matryoshka){
        this.dolls.addAll(
                Stream.of(matryoshka)
                        .filter(Objects::nonNull)
                .collect(Collectors.toList()));
    }

    @Override
    public void open() {
        this.dolls.forEach(Matryoshka::open);
    }
}
