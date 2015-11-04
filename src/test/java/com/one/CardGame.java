package com.one;

import java.util.ArrayList;

class Card {
    private String rank;
    private String suit;

    public Card(String r,String s) {
        rank=r;
        suit=s;
    }

    public String getRank() {
        return rank;    
    }

    public String getSuit() {
        return suit;
    }

    public String toString() {
        return rank+" of "+suit;
    }   
}

class Deck {
    private ArrayList<Card> deck;
    private String[] ranks ={"ACE","2","3","4","5","6","7","8","9","10","JACK","QUEEN","KING"};
    private String[] suits ={"SPADE","HEART","CLUB","DIAMOND"};

    public Deck() {
        deck = new ArrayList<Card>();
        for(int i=0;i<suits.length;i++) {
            for(int j=0;j<ranks.length;j++) {
                deck.add(new Card(ranks[j],suits[i]));
            }
        }
    }

    public void showCards() {
        System.out.println("\n\n Showing Cards !!!");
        int i=1;
        for(Card c:deck) {
            System.out.println("Card "+(i++)+" : "+c);
        }
    }

    public  void shuffle() {
        ArrayList<Card> temp = new ArrayList<Card>();
        while(!deck.isEmpty()) {
            int loc=(int)(Math.random()*deck.size());
            temp.add(deck.get(loc));
            deck.remove(loc);   
        }
        deck=temp;
    }       

}

public class CardGame {
    public static void main(String[] args) {
        Deck myDeck = new Deck();
        myDeck.showCards();
        myDeck.shuffle();
        myDeck.showCards();
    }

}
