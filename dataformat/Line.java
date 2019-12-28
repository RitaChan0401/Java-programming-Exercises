package dataformat;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Line implements Iterable<String>{

    //Iteratorは集合の要素に順番にアクセスする時に使用するインターフェース
    public Iterator<String> iterator(){
        List<String> line = Arrays.asList("c" , "d");
        return line.iterator();
    }
}
