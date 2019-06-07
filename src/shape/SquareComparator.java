package shape;

import java.util.Comparator;

public class SquareComparator implements Comparator<Square> {
    @Override
    public int compare(Square squ1,Square squ2){
        if (squ1.getSide()>squ2.getSide()) return 1;
        else if (squ1.getSide()<squ2.getSide()) return -1;
        else return 0;
    }
}
