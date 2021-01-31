package TestPriorityQueue;

import java.util.Comparator;
import java.util.Objects;
import java.util.PriorityQueue;
import java.lang.*;
class Card1 implements Comparable<Card1>{
    public int rank;
    public String suit;

    public Card1(int rank,String suit){
        this.rank=rank;
        this.suit=suit;
    }

    @Override
    public int compareTo(Card1 o) {
        return this.rank-o.rank;
    }

    @Override
    public String toString() {
        return "Card{" +
                "rank=" + rank +
                ", suit='" + suit + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card1 card1 = (Card1) o;
        return rank == card1.rank &&
                Objects.equals(suit, card1.suit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rank, suit);
    }
}
class Card{
    public int rank;
    public String suit;

   public Card(int rank,String suit){
       this.rank=rank;
       this.suit=suit;
   }

    @Override
    public String toString() {
        return "Card{" +
                "rank=" + rank +
                ", suit='" + suit + '\'' +
                '}';
    }
}
public class TestPriorityQueue {
    public static void main(String[] args) {
       /* PriorityQueue<Card>p=new PriorityQueue<>(new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return o1.rank-o2.rank;
            }
        });
        p.offer(new Card(1,"♦"));
        p.offer(new Card(2,"♦"));
        p.offer(new Card(3,"♦"));
        System.out.println(p);
        PriorityQueue<Integer>p1=new PriorityQueue<>();
        p1.offer(3);
        p1.offer(6);
        p1.offer(4);
        System.out.println(p1);*/
        PriorityQueue<Card1> p=new PriorityQueue<>();
        p.offer(new Card1(1,"♦"));
        p.offer(new Card1(2,"♦"));
        p.offer(new Card1(3,"♦"));
        System.out.println(p);
        Card1 card1=new Card1(1,"♦");
        Card1 card2=new Card1(1,"♦");
        System.out.println(card1.compareTo(card2));
        System.out.println(card1.equals(card2));

    }
}
