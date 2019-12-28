package Algorithm;

import Algorithm.Cell;

public class LinkedList {
    private Cell header = new Cell("dummy"); //プログラムの簡略化

    public LinkedList(){

    }

    public void add(Object data){
        Cell cell = this.header;
        while (cell.getNext() != null){
            cell = cell.getNext();
        }
        cell.setNext(new Cell(data));
    }

    public Object get(int index){
        Cell cell = this.header.getNext();
        int i = 0;
        while (cell != null){
            if(i == index){
                return cell.getData();
            }
            i++;
            cell = cell.getNext();
        }
        return null;
    }

    public int size(){
        Cell cell = this.header.getNext();
        int i = 0;
        while (cell != null){
            i++;
            cell = cell.getNext();
        }
        return i;
    }

    public void print(){
        Cell cell = this.header.getNext();
        int i = 0;
        while (cell != null){
            System.out.print(i + ":" + cell.getData() + " ");
            i++;
            cell = cell.getNext();
        }
        System.out.println();
    }

    public void insert(int index , Object data){
        Cell preCell = this.header;
        int i = 0;
        while (preCell != null){
            if (i== index){
                Cell newCell = new Cell(data);
                newCell.setNext(preCell.getNext());
                preCell.setNext(newCell);
                return;
            }
            i++;
            preCell = preCell.getNext();
        }
    }

    public Object remove(int index) {
        Cell preCell = this.header;
        Cell cell = preCell.getNext();
        int i = 0;
        while (cell != null) {
            if (i == index){
                Cell nextCell = cell.getNext();
                preCell.setNext(nextCell);
                return cell.getData();
            }
            i++;
            preCell = cell;
            cell = cell.getNext();
        }
        return null;
    }

}
