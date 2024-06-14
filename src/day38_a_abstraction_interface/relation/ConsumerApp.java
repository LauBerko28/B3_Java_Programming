package day38_a_abstraction_interface.relation;
import day38_a_abstraction_interface.shopping.Shipping;

// extends comes from inheritance to inheritance
// can have multiple interfaces linked by using ,
// going from interface to interface is INHERITANCE and is done with the keyword "extends"
//Since these are interface, they do not follow the same rules as classes

// We are passing the methods from AllowUserToSell and Shipping interfaces to ConsumerApp interface
public interface ConsumerApp extends AllowUserToSell, Shipping {

}

// class to class           ---> extends
// class to interface       ---> implements
// interface to interface   ---> extends


// concrete class until i add the word abstract
abstract class TestA implements Shipping, AllowUserToSell{

}
