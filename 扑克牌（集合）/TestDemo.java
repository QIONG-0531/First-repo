import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Card{
    public int rank;
    public String suit;

    @Override
    public String toString() {
        return "["+rank+suit+"]"+" ";
    }
}
public class TestDemo {
    public static String[]SUITS={"♠","♥","♣","♣"};
    //买牌
    public static List<Card> buyDeck(){
        List<Card> list=new ArrayList<>();
        for(int i=0;i<4;i++){
            for(int j=1;j<=13;j++){
                Card card=new Card();
                card.rank=j;
                card.suit=SUITS[i];
                list.add(card);
            }
        }
        return list;
    }
    //洗牌
    public static void shuffle(List<Card> deck){
        Random random=new Random();
        for(int i=deck.size()-1;i>0;i--){
            int j=random.nextInt(i);//i为边界
            swap(deck,i,j);
        }
    }
    public static void swap(List<Card> deck,int i,int j){
        Card n=deck.get(i);
        deck.set(i,deck.get(j));
        deck.set(j,n);
    }

    public static void main(String[] args) {
        List<Card> deck=buyDeck();
        System.out.println("买牌");
        System.out.println(deck);
        shuffle(deck);
        System.out.println("洗牌");
        System.out.println(deck);
        //三个人，每人轮流抓5张牌
        List<List<Card>> hands=new ArrayList<>();
        hands.add(new ArrayList<>());
        hands.add(new ArrayList<>());
        hands.add(new ArrayList<>());
        for(int i=0;i<5;i++){
            for(int j=0;j<3;j++){
               hands.get(j).add(deck.remove(0));
            }
        }
        System.out.println("剩余的牌");
        System.out.println(deck);
        System.out.println("第一个人的牌");
        System.out.println(hands.get(0));
        System.out.println("第二个人的牌");
        System.out.println(hands.get(1));
        System.out.println("第三个人的牌");
        System.out.println(hands.get(2));
    }

}
