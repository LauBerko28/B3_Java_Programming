package day07_relational_operators;
/*
    Task:
        declare and assign a gift card with 200
        buy 2 items.
        buy item 1 for x price and subtract from your gift card
        buy item 2 for x price and subtract from your gift card
        print the remaining balance of your gift card

        100
        40
 */
public class GiftCrad {
    public static void main(String[] args) {
        double giftCargBalance = 200;
        double item1Price = 100;
        double item2Price = 50;
        System.out.println("In my gift card, I have $" + giftCargBalance + " balance.");
        System.out.println("Buy item 1 for $" + item1Price + " with your gift card.");
        //giftCargBalance = giftCargBalance - item1Price;
        giftCargBalance -= item1Price; // same as above - just using SHORTHAND operator ** when I'm using the same variable to assign a new value then i can use a shorthand operator
                                        // shortens what I want to do

        System.out.println("After purchasing item 1, my gift card balance is $" + giftCargBalance);
        giftCargBalance -= item2Price;
        System.out.println("After purchasing item 1, my gift card balance is $" + giftCargBalance);







    }
}
