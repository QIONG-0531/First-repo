import java.util.Comparator;

class Card{
    public int rank;
    public String suit;

    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override//比较方式一：覆写equals方法
    public boolean equals(Object o) {
     // 自己和自己比较
        if (this == o) {
            return true;
        }
     // o如果是null对象，或者o不是Card的子类
        if (o == null || !(o instanceof Card)) {
            return false;
        }
        Card c = (Card)o;
        return rank == c.rank
                && suit.equals(c.suit);
    }
}
class Card1 implements Comparable<Card1>{//比较方式二：定义类时实现comparable接口，重写compareto方法
    public int rank;
    public String suit;

    public Card1(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public int compareTo(Card1 o) {
        return this.rank-o.rank;
    }
}

//基于比较器比较
class Card2 {
    public int rank;
    public String suit;

    public Card2(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }
}
//自定义一个比较器是，实现Comparator接口
class Card2Comparator implements Comparator<Card2>{
    @Override
    public int compare(Card2 o1, Card2 o2) {
        return o1.rank-o2.rank;
    }
}

public class Test1 {

}
